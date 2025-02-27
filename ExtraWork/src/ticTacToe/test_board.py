import unittest
import board

class TestBoard(unittest.TestCase):
    def setUp(self):
        self.game = board.Board()

    def test_can_make_a_move(self):
        self.assertTrue(self.game.make_move(0, 0, 'X'))

    def test_cannot_move_to_same_position_twice(self):
        self.game.make_move(0, 0, 'X')
        with self.assertRaises(ValueError):
            self.game.make_move(0, 0, 'O')

    def test_row_winner(self):
        self.game.make_move(0, 0, 'X')
        self.game.make_move(0, 1, 'X')
        self.game.make_move(0, 2, 'X')
        self.assertEqual("Player X wins!", self.game.check_winner())

    def test_column_winner(self):
        self.game.make_move(0, 0, 'X')
        self.game.make_move(1, 0, 'X')
        self.game.make_move(2, 0, 'X')
        self.assertEqual("Player X wins!", self.game.check_winner())

    def test_diagonal_winner(self):
        self.game.make_move(0, 0, 'X')
        self.game.make_move(1, 1, 'X')
        self.game.make_move(2, 2, 'X')
        self.assertEqual("Player X wins!", self.game.check_winner())

    def test_other_diagonal_winner(self):
        self.game.make_move(0, 2, 'X')
        self.game.make_move(1, 1, 'X')
        self.game.make_move(2, 0, 'X')
        self.assertEqual("Player X wins!", self.game.check_winner())

    def test_draw(self):
        self.game.make_move(0, 0, 'X')
        self.game.make_move(1, 0, 'O')
        self.game.make_move(2, 0, 'X')
        self.game.make_move(1, 1, 'O')
        self.game.make_move(1, 2, 'X')
        self.game.make_move(2, 1, 'O')
        self.game.make_move(0, 1, 'X')
        self.game.make_move(0, 2, 'O')
        self.game.make_move(2, 2, 'X')
        self.assertEqual("It's a draw!", self.game.check_winner())

from ticTacToe import board


class TicTacToe:
    def __init__(self):
        self.game = board.Board()

    def main(self):
        player_one = input("Player one symbol : ").upper()
        player_two = input("Player two symbol : ").upper()
        while player_one == player_two:
            print("player 2 symbol can not be same as player one")
            player_two = input("Player two symbol : ").upper()

        print(f"Player One: {player_one}, Player Two: {player_two}")

        for turn in range(9):
            print(self.game.get_board_as_string())

            player = player_one if turn % 2 == 0 else player_two
            print(f"Player {player}'s turn")

            row = int(input("Enter the row number (0-2): "))
            col = int(input("Enter the column number (0-2): "))

            try:
                self.game.make_move(row, col, player)
            except ValueError as e:
                print(e)
                row = int(input("Enter the row number (0-2): "))
                col = int(input("Enter the column number (0-2): "))

            winner = self.game.check_winner()
            if "wins" in winner:
                print(self.game.get_board_as_string())
                print(winner)
                return

        print(self.game.get_board_as_string())
        print("It's a draw!")


if __name__ == "__main__":
    try:
        TicTacToe().main()
    except ValueError as e:
        print(e)
    except KeyboardInterrupt as e:
        print(e)


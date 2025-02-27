class Board:
    def __init__(self):
        self.board = [[' ' for _ in range(3)] for _ in range(3)]

    def make_move(self, row, column, player):
        if row < 0 or row >= 3 or column < 0 or column >= 3:
            raise ValueError("Invalid position! Choose between 0 and 2.")
        if self.board[row][column] != ' ':
            raise ValueError("This position is already occupied!")
        self.board[row][column] = player
        return True

    def check_winner(self):
        for i in range(3):
            if self.board[i][0] != ' ' and self.board[i][0] == self.board[i][1] == self.board[i][2]:
                return f"Player {self.board[i][0]} wins!"
            if self.board[0][i] != ' ' and self.board[0][i] == self.board[1][i] == self.board[2][i]:
                return f"Player {self.board[0][i]} wins!"

        if self.board[0][0] != ' ' and self.board[0][0] == self.board[1][1] == self.board[2][2]:
            return f"Player {self.board[0][0]} wins!"
        if self.board[0][2] != ' ' and self.board[0][2] == self.board[1][1] == self.board[2][0]:
            return f"Player {self.board[0][2]} wins!"

        return "It's a draw!"

    def get_board_as_string(self):
        board_string = "\n".join(" | ".join('_' if cell == ' ' else cell for cell in row) for row in self.board)
        return board_string

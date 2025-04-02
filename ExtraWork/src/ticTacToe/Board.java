package ticTacToe;

public class Board {
    private char[][] board = new char[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public boolean makeMove(int row, int column, char input) {
        if (row < 0 || row >= 3 || column < 0 || column >= 3) {
            throw new IllegalArgumentException("Invalid position! Choose between 0 and 2.");
        }
        if (board[row][column] != ' ') {
            throw new IllegalArgumentException("This position is already occupied!");
        }
        board[row][column] = input;
        return true;
    }

    public String checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return "Player " + board[i][0] + " wins!";
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return "Player " + board[0][i] + " wins!";
            }
        }

        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return "Player " + board[0][0] + " wins!";
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return "Player " + board[0][2] + " wins!";
        }



        return "It's a draw!";
    }

    public String getBoardAsString() {
        StringBuilder boardString = new StringBuilder();
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boardString.append(board[row][col] == ' ' ? "_" : board[row][col]);
                if (col < 2) {
                    boardString.append(" | ");
                }
            }
            boardString.append("\n");
        }
        return boardString.toString();
    }
}

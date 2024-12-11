import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = "EMPTY";
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }

        for (int move = 0; move < 9; move++) {
            int count = move % 2;
            System.out.println("Player " + (count + 1));

            int row = -1;
            int col = -1;

            int inputAttempts = 0;
            do {
                if (inputAttempts > 0) {
                    System.out.println("Invalid input or cell already occupied. Try again.");
                }
                System.out.println("Enter number of row (1-3):");
                row = scanner.nextInt();
                System.out.println("Enter number of column (1-3):");
                col = scanner.nextInt();
                inputAttempts++;
            } while (row < 1 || row > 3 || col < 1 || col > 3 || !board[row - 1][col - 1].equals("EMPTY"));

        
            board[row - 1][col - 1] = count == 0 ? "X" : "O";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][0].equals("EMPTY")) ||
                (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2]) && !board[1][0].equals("EMPTY")) ||
                (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2]) && !board[2][0].equals("EMPTY")) ||
                (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0]) && !board[0][0].equals("EMPTY")) ||
                (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1]) && !board[0][1].equals("EMPTY")) ||
                (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2]) && !board[0][2].equals("EMPTY")) ||
                (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("EMPTY")) ||
                (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("EMPTY"))) {
                System.out.println("Player " + (count + 1) + " Wins!");
                return;
            }
        }

        System.out.println("It's a draw!");
    }
}

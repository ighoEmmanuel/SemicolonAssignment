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
	for (int move = 0; move < 9; move++){
        for (int count = 0; count < 2; count++) {
            System.out.println("Player " + (count + 1));

            System.out.println("Enter number of row:");
            int row = scanner.nextInt();
            while (row > 3 || row < 1) {
                System.out.println("Invalid input. Row must be between 1 and 3.");
                row = scanner.nextInt();
            }

            System.out.println("Enter number of column:");
            int col = scanner.nextInt();
            while (col > 3 || col < 1) {
                System.out.println("Invalid input. Column must be between 1 and 3.");
                col = scanner.nextInt();
            }

            board[row - 1][col - 1] = count == 0 ? "X" : "O";

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
	if(board[0][0].equals("X")&&board[0][1].equals("X")&&board[0][2].equals("X")){
	System.out.println();
	System.out.print("Player 1 Wins");
		break;
}
		
}
    }
}

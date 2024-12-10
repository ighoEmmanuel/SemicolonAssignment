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
	

        int player = 1;

        for (int move = 0; move < 9; move++) {
            System.out.println("Player " + player + "'s turn.");
            System.out.print("Enter row (1-3): ");
            int row = scanner.nextInt() - 1;
            if(row < 0 && row > 3){
		System.out.print("Invalid input!!");
		row = scanner.nextInt() - 1;
	}

            System.out.print("Enter column (1-3): ");
            int col = scanner.nextInt() - 1;
            if(col < 0 ||col > 3){
		System.out.print("Invalid input");
		col = scanner.nextInt() - 1;
}

            if (board[row][col].equals("EMPTY")) {
                if (player == 1) {
                    board[row][col] = "X";
                    player = 2;
                } else {
                    board[row][col] = "O";
                    
                }
            } else {
                System.out.println("Cell is already occupied! Try again.");
                move--;
                continue;
            }

            System.out.println("Updated Board:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + "\t");
                }
                System.out.println();
            }
        }

        System.out.println("Game Over!");
    }
}

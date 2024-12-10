import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = "EMPTY";
            }
        }

        int player = 1;

        for (int move = 0; move < 9; move++) {
            System.out.println("Player " + player + "'s turn.");

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 1-100
        Scanner scanner = new Scanner(System.in);
        int trier = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            trier++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
            } else {
                System.out.println("Congratulations! You found the number in " + guess + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
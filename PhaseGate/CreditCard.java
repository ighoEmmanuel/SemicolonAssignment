import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 for visa Cards\n5 for MasterCard\n37 for American Express Cards\n6 for Discover cards");
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 4:
                System.out.println("Hello, Kindly Enter Card details to verify");
                String cardDetails = scanner.nextLine();
                validator(cardDetails, "Visa Cards");
                break;
            case 5:
                System.out.println("Hello, Kindly Enter Card details to verify");
                String enter = scanner.nextLine();
                validator(enter, "MasterCard");
                break;
            case 37:
                System.out.println("Hello, Kindly Enter Card details to verify");
                String number = scanner.nextLine();
                validator(number, "American Express");
                break;
            case 6:
                System.out.println("Hello, Kindly Enter Card details to verify");
                String cardNumber = scanner.nextLine();
                validator(cardNumber, "Discover Card");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    public static int validatorOdd(String input) {
        int sum = 0;
        for (int count = 0; count < input.length(); count += 2) {
            int number = Character.getNumericValue(input.charAt(count));
            number = number * 2;
            if (number >= 10) {
                int firstNumber = number / 10;
                int secondNumber = number % 10;
                int sumOfDigit = firstNumber + secondNumber;
                sum += sumOfDigit;
            } else {
                sum += number;
            }
        }
        return sum;
    }

    public static int validatorEven(String input) {
        int sumOfEven = 0;
        for (int count = 1; count < input.length(); count += 2) {
            int number = Character.getNumericValue(input.charAt(count));
            number = number * 2;
            if (number >= 10) {
                int firstNumber = number / 10;
                int secondNumber = number % 10;
                int sumOfDigit = firstNumber + secondNumber;
                sumOfEven += sumOfDigit;
            } else {
                sumOfEven += number;
            }
        }
        return sumOfEven;
    }

    public static void validator(String input, String cardType) {
        int len = input.length();
        int addition = validatorEven(input) + validatorOdd(input);
        if (addition % 10 != 0) {
            System.out.println("********************************************");
            System.out.println("**Credit Card Type: " + cardType);
            System.out.println("**Credit card Number: " + input);
            System.out.println("**Credit card Digit Length: " + len);
            System.out.println("**Credit card Validity status: Valid");
            System.out.println("********************************************");
        } else {
            System.out.println("********************************************");
            System.out.println("**Credit Card Type: " + cardType);
            System.out.println("**Credit card Number: " + input);
            System.out.println("**Credit card Digit Length: " + len);
            System.out.println("**Credit card Validity status: Invalid");
            System.out.println("********************************************");
        }
    }
}

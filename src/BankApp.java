import java.util.Scanner;
import javax.swing.*;

public class BankApp {
    public static Bank bank = new Bank();

    public static void main(String[] args) {
        String choice = "";
        do {
            choice = input("""
                    Welcome to the Bank
                    
                    where is our menu:
                    
                    1. Create a new account
                    2. Deposit
                    3. Withdraw
                    4. Check Account Balance
                    5. Transfer Money
                    6. Exit""");

            while (!choice.matches("[1-9]")) {
                choice = input("Invalid Entry Please choose between 1 and 9");
            }


            switch (choice) {
                case "1" -> createAccount();
                case "2" -> deposit();
                case "3" -> withdraw();
                case "4" -> checkBalance();
                case "5" -> transfer();
                case "6" -> exit();
                default -> prompt("Invalid choice." +
                        "Enter from 1-6");
            }
        } while (!choice.equals("6"));

    }

    public static void exit() {
        prompt("Thank you for using Bank App");
        System.exit(0);
    }

    public static void transfer() {
        try {
            int ownerAccountNumber = Integer.parseInt(input("Enter owner account number: "));
            int beneficiary = Integer.parseInt(input("Enter beneficiary number: "));
            String password = input("Enter password: ");
            String amountStr = input("Enter Amount: ");

            amountStr = amountStr.replaceAll("[^0-9.]", "");

            if (amountStr.isEmpty()) {
                throw new IllegalArgumentException("Invalid amount entered.");
            }

            double amount = Double.parseDouble(amountStr);
            bank.transfer(ownerAccountNumber, beneficiary, amount, password);
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }
    }

    public static void checkBalance() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            String password = input("Enter password: ");
            prompt(String.valueOf(bank.getBalance(accountNumber, password)));
        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
        }
    }


    public static void withdraw() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            String amountStr = input("Enter Amount: ");

            amountStr = amountStr.replaceAll("[^0-9.]", "");

            if (amountStr.isEmpty()) {
                throw new IllegalArgumentException("Invalid amount entered.");
            }

            double amount = Double.parseDouble(amountStr);

            bank.withdraw(accountNumber, amount);

        } catch (IllegalArgumentException e) {
            prompt(e.getMessage());
            prompt("Withdraw failed.");
        }
    }


    public static void deposit() {
        try {
            int accountNumber = Integer.parseInt(input("Enter account number: "));
            String amountStr = input("Enter Amount: ");

            amountStr = amountStr.replaceAll("[^0-9.]", "");

            if (amountStr.isEmpty()) {
                throw new IllegalArgumentException("Invalid amount entered.");
            }

            double amount = Double.parseDouble(amountStr);
            bank.deposit(accountNumber, amount);
        } catch (IllegalArgumentException e) {
            prompt("Error: " + e.getMessage());
        }
    }

    public static void createAccount() {
        try {
            String firstName = input("Enter first name: ");
            String lastName = input("Enter last name: ");
            String password = input("Enter password: ");
            bank.createAccount(firstName, lastName, password);
        } catch (IllegalArgumentException e) {
            prompt("Error: " + e.getMessage());
        }
    }

    public static void prompt(String message) {
        System.out.println(message);
    }

    public static String input(String message) {
        prompt(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
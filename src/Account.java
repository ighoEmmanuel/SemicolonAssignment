import java.util.Random;

public class Account {
    private double balance = 0;
    private String firstName;
    private String lastName;
    private String password;
    public int accountNumber;

    public Account(int accountNumber, String firstName, String lastName, String password) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
            this.accountNumber = accountNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.password = password;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getBalance(String password) {
        if (password.equals(this.password)) {
            return balance;
        } else {
            throw new IllegalArgumentException("Incorrect password");
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public void updatePassword(String oldPassword, String newPassword) {
        if (oldPassword == null||newPassword == null) {
            throw new IllegalArgumentException("Old and new password cannot be Empty");
        }
        if (pinValidator(oldPassword)) {
            if (oldPassword.equals(newPassword)) {
                System.out.println("Former password can't be the same as the new password");
            } else {
                password = newPassword;
                System.out.println("Password updated successfully");
            }
        } else {
            System.out.println("Incorrect password");
        }
    }

    public boolean pinValidator(String pin) {
        if (pin == null || pin.isEmpty()) {
            throw new IllegalArgumentException("Pin cannot be null or empty");
        }
        return pin.equals(this.password);
    }



}

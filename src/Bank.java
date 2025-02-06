import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> bank = new ArrayList<>();
    private int accountCounter = 0;
    private Account account ;

    public void createAccount(String firstName, String lastName, String password) {
        try {
            int newAccountNumber = getAccountNumber();
            Account newAccount = new Account(newAccountNumber, firstName, lastName, password);
            bank.add(newAccount);
            accountCounter++;
            System.out.println("Account created successfully! Your account number is: " + newAccountNumber);
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }




    public int getAccountNumber() {
        return bank.size() + 1;
    }


public void deposit(int accountNumber, double amount){
        try {
            account = findAccount(accountNumber);
            if (account != null) {
                account.deposit(amount);
                System.out.println("Deposit successful");
            } else {
                System.out.println("Account not found");
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
}

    public Account findAccount(int accountNumber) {
        for (Account account : bank) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }



    public double getBalance(int accountNumber, String password) {
        Account account = findAccount(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("No account found");
        } else {
            if (account.pinValidator(password)) {
                return account.getBalance(password);
            } else {
                throw new IllegalArgumentException("Incorrect password");
            }
        }
    }

    public void withdraw(int accountNumber, double amount,String password) {
        try {
            account = findAccount(accountNumber);
            if (account != null) {
                if (account.pinValidator(password)) {
                    account.withdraw(amount);
                    System.out.println("Withdraw successful");
                }else{
                    System.out.println("Incorrect password");
                    System.out.println("withdraw failed");
                }
            } else {
                System.out.println("Account not found");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount, String password) {
        try {
            Account fromAccount = findAccount(fromAccountNumber);
            if (!fromAccount.pinValidator(password)) {
                throw new IllegalArgumentException("Incorrect password for the sender's account.");
            }
            fromAccount.withdraw(amount);
            Account toAccount = findAccount(toAccountNumber);
            if (toAccount != null) {
                toAccount.deposit(amount);
                System.out.println("Transfer successful");
            } else {
                fromAccount.deposit(amount);
                System.out.println("Transfer failed" +
                        " beneficiary Account not found");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }


}
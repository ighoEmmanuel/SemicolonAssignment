import java.util.HashMap;

public class Bank {
    private HashMap<String, String> bank = new HashMap<>();
    Account account;

    public String getAccountNumber() {
        String accountNumber = "";
        for (int count = 1; count <= 16; count++) {
            accountNumber += count;
        }
        return accountNumber;
    }

    public void createAccount(String name, String lastName, String password) {
        account = new Account(name, lastName, password);
        bank.put(getAccountNumber(), password);
    }

    public void deposit(String accountNumber, double amount) {
        if (bank.containsKey(accountNumber)) {
            account.deposit(amount);
        }
    }

    public void withdraw(double amount, String accountNumber) {
        if (bank.containsKey(accountNumber)) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public int checkBalance(String accountNumber, String password) {
        if (bank.containsKey(accountNumber)) {
            if(bank.get(accountNumber).equals(password)) {
                account.getBalance(password);
            }else{
                return -1;
            }
        }else{ System.out.println("Account not found"); }
        return 0;
    }

}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {

    @Test
    public void testMyAccountBalance(){
        Account account = new Account("John", "Doe", "securePassword");
        assertEquals(0, account.getBalance("securePassword"));
    }

    @Test
    public void testMyAccountReturnsErrorIfNameIsEmpty(){
        assertThrows(IllegalArgumentException.class, () -> {Account account = new Account("", "Doe", "securePassword");},"First name cannot be null or empty");
    }

    @Test
    public void testMyAccountReturnsErrorIfLastNameIsEmpty(){
        assertThrows(IllegalArgumentException.class, () -> {Account account = new Account("John", "", "securePassword");},"Last name cannot be null or empty");
    }

    @Test
    public void testMyAccountReturnsErrorIfPasswordIsEmpty(){
        assertThrows(IllegalArgumentException.class, () ->{Account account = new Account("John", "Doe", "");},"Password cannot be null or empty");
    }

    @Test
    public void testMyAccountDeposit(){
        Account account = new Account("John", "Doe", "securePassword");
        account.deposit(20000);
        assertEquals(20000, account.getBalance("securePassword"));
    }

    @Test
    public void testMyAccountWhenIDepositXAndYReturnBalance(){
        Account account = new Account("John", "Doe", "securePassword");
        account.deposit(20000);
        account.deposit(20000);
        assertEquals(40000, account.getBalance("securePassword"));
    }

    @Test
    public void testMyAccountWhenDepositAndInvalidAmountReturnError(){
        Account account = new Account("John", "Doe", "securePassword");
        assertThrows(IllegalArgumentException.class, ()->{
            account.deposit(-2000);
        },"Invalid amount");
    }

    @Test
    public void testMyAccountWithdraw(){
        Account account = new Account("John", "Doe", "securePassword");
        account.deposit(20000);
        account.withdraw(5000);
        assertEquals(15000, account.getBalance("securePassword"));
    }

    @Test
    public void testMyAccountWithdrawWhenIEnterNegativeValueItThrowsError(){
        Account account = new Account("John", "Doe", "securePassword");
        account.deposit(20000);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-5000);
        }, "Amount cannot be negative");
    }




}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBank {

    @Test
    public void testMyBankCanDeposit() {
        Bank bank = new Bank();
        bank.createAccount("Emmanuel", "Igho", "Emmanuel");
        bank.deposit(1, 5_000);
        assertEquals(5_000, bank.getBalance(1, "Emmanuel"));
    }

    @Test
    public void testMyBankCanWithdraw() {
        Bank bank = new Bank();
        bank.createAccount("Emmanuel", "Igho", "Emmanuel");
        bank.deposit(1, 5_000);
        bank.withdraw(1, 2_000,"Emmanuel");
        assertEquals(3_000, bank.getBalance(1, "Emmanuel"));
    }

    @Test
    public void testMyBankThrowsErrorWhenAccountNumberIsNotValid() {
        Bank bank = new Bank();
        bank.createAccount("Emmanuel", "Igho", "Emmanuel");
        bank.deposit(1, 5_000);
        assertThrows(IllegalArgumentException.class, () -> bank.getBalance(9999, "Emmanuel"), "No account found");
    }


    @Test
    public void testMyBankCanTransfer() {
        Bank bank = new Bank();
        bank.createAccount("Emmanuel", "Igho", "Emmanuel");
        bank.deposit(1, 5_000);
        bank.createAccount("lase","oyanahem","lase");
        bank.transfer(1,2,500,"Emmanuel");
        bank.getBalance(1, "Emmanuel");
        bank.getBalance(2, "lase");
    }
}

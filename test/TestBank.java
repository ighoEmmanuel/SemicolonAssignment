import org.junit.jupiter.api.Test;

public class TestBank {

    @Test
    public void testMyBankCreateAccount() {
        Bank bank = new Bank();
        bank.createAccount("Emmanuel", "igho", "2333");
    }

    @Test
    public void testMyBankDeposit() {
        Bank bank = new Bank();
         bank.deposit("223344",200.00);
    }
}

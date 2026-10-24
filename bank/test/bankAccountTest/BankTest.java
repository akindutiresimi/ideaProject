package bankAccountTest;

import bankAccount.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank bank;

    @BeforeEach
    public void setUp() {
        bank = new Bank("First Bank","001");
        bank.createAccount("001", "Samuel");
        bank.createAccount("002", "Daniel");
    }

    @Test
    public void testThatABankExists() {
        assertNotNull(bank);
        assertEquals("First Bank", bank.getName());
    }

    @Test
    public void testThatTheBankCanCreateAccount() {
        bank.createAccount("003", "wale");
        assertEquals(0, bank.checkBalance("003"));
    }

    @Test
    public void testThatCheckingBalanceOnNonExistentAccountThrows() {
        assertThrows(NoSuchElementException.class, () -> bank.checkBalance("999"));
    }

    @Test
    public void testThatTheBankCanDepositIntoTheAccount() {
        bank.deposit("001", 10000);
        assertEquals(10000, bank.checkBalance("001"));
    }

    @Test
    public void testThatICanWithdrawMoneyFromTheBankAccount() {
        bank.deposit("001", 10000);
        bank.withdraw("001", 3000, "Samuel");
        assertEquals(7000, bank.checkBalance("001"));
    }

    @Test
    public void testThatAAccountNumberCanTransferToAnotherExistingAccountNumber() {
        bank.deposit("001", 10000);
        bank.transfer("001","002", 5000, "Samuel");
        assertEquals(5000, bank.checkBalance("001"));
        assertEquals(5000, bank.checkBalance("002"));
    }

    @Test
    public void testThatTransferWithWrongPasswordThrowsAndException() {
        bank.deposit("001", 10000);
        //bank.transfer("001","002",3000,"samuel");
        assertThrows(IllegalArgumentException.class, () -> bank.transfer("001", "002",3000, "samuel"));
        assertEquals(10000, bank.checkBalance("001"));
        assertEquals(0,bank.checkBalance("002"));
    }
}
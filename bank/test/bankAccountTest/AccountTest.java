package bankAccountTest;


import bankAccount.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AccountTest {

    @Test
    public void testThatICReateAnAccount_MyAccountBalanceIsZero_IDepositFiveHundred() {
        Account account = new Account("Samuel");

        assertEquals(0 , account.checkBalance());

        account.deposit(1000);
        assertEquals(1000 , account.checkBalance());
    }

    @Test
    public void testThatICreateAnAccount_MyAccountBalanceISZero_IDepositNegativeAmount() {
        Account account = new Account("Samuel");

        assertEquals(0, account.checkBalance());

        account.deposit(-1000);
        assertEquals(0, account.checkBalance());
    }

    @Test
    public void testThatICreateAnAccount_MyAccountBalanceIsZero_IDeposit1k_IWithdrawFiveHundred_MyBalanceRemainFiveHundred() {
        Account account = new Account("Samuel");

        assertEquals(0, account.checkBalance());

        account.deposit(1_000);
        assertEquals(1_000, account.checkBalance());

        account.withdraw(500, "Samuel");
        assertEquals(500, account.checkBalance());

        account.deposit(2000);
        assertEquals(2500, account.checkBalance());

        account.withdraw(3000, "Samuel");
        assertEquals(2500,account.checkBalance());
    }
    @Test
    public void testThatYouCantWithdrawNegativeAmount(){

        Account account = new Account("1234");
        account.withdraw(-5000, "1234");

        assertEquals(0, account.checkBalance());
    }

    @Test
    public void testThatWhenYouEnterAWrongPasswordItThrowsAnExpecrtion() {
        Account account = new Account("Daniel");
        account.deposit(5000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000, "samuel"));

    }

}

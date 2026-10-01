package bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Bank {
    private String name;
    private Map<String, Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Account createAccount(String accountNumber, String password) {
        if (accounts.containsKey(accountNumber)) {
            throw new IllegalArgumentException("Account already exists: " + accountNumber);
        }
        Account account = new Account(password);
        accounts.put(accountNumber, account);
        return account;
    }

    public Account getAccount(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account == null) {
            throw new NoSuchElementException("No such account: " + accountNumber);
        }
        return account;
    }


    public void deposit(String accountNumber, double amount) {
        getAccount(accountNumber).deposit(amount);
    }

    public void withdraw(String accountNumber, double amount, String password) {
        getAccount(accountNumber).withdraw(amount, password);
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount, String password) {
        Account from = getAccount(fromAccountNumber);
        Account to = getAccount(toAccountNumber);

        from.withdraw(amount, password);
        to.deposit(amount);
    }

    public double checkBalance(String accountNumber) {
        return getAccount(accountNumber).checkBalance();
    }
}
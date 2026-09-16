package accountFolder;

public class Account{
    private double balance;

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0)balance += amount;
    }

    public void withdraw(double amount) {
        if(amount < balance && balance > 0) balance -= amount;

    }
}

package bankAccount;


public class Account{
    private String password;
    private double balance;

    public Account(String password){
        this.password = password;
    }

    public boolean getPassword(String word){
        return password.equals(word);
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0)balance += amount;
    }

    public void withdraw(double amount, String password) {
        if(!getPassword(password)) {
            throw new IllegalArgumentException("The passwprd is not correct");
        }
        if(amount < balance && balance > 0) balance -= amount;

    }

}


package bankAccount;

import java.util.Scanner;

public class Main {

    private static Bank bank = new Bank("First Bank");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=========  Welcome to " + bank.getName() + "  =========");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAccount();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    transfer();
                    break;
                case "5":
                    checkBalance();
                    break;
                case "6":
                    System.out.println("Thank you for banking with " + bank.getName() + "!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter a new account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Set a password: ");
        String password = scanner.nextLine();

        try {
            bank.createAccount(accountNumber, password);
            System.out.println("Account " + accountNumber + " created successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());

        try {
            bank.deposit(accountNumber, amount);
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            bank.withdraw(accountNumber, amount, password);
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void transfer() {
        System.out.print("Enter your account number: ");
        String fromAccount = scanner.nextLine();
        System.out.print("Enter recipient's account number: ");
        String toAccount = scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        try {
            bank.transfer(fromAccount, toAccount, amount, password);
            System.out.println("Transferred " + amount + " to account " + toAccount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        try {
            double balance = bank.checkBalance(accountNumber);
            System.out.println("Balance for account " + accountNumber + ": " + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
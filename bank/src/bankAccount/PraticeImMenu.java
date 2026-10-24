package bankAccount;

import java.util.Scanner;

import static sun.jvm.hotspot.runtime.DeadlockDetector.print;

public class PraticeImMenu {
    Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        goToMainmenu();

    }
}
    public static void  mainMenu() {
        System.out.println("""
        1. create Account
        2. Deposit
        3. Withdraw
        4. Transfer
        5. Check balance
        6. Exit
        7. Default
        """);

        Switch(mainMenu();) {
            case 1:
                createAccount();
                break;
            case 2:
                Deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                transfer();
                break;
            case 5:
                checkBalance();
                break;
            case 6:
                exit;
                break;
            default
                ;
                print("invalid option re-enter option");


        }
    }


public static void createAccount() {
    System.out.println("enter an account number");
    System.out.println("enter your password");

    try{
        bank.createAccount(username, password)
    }
}
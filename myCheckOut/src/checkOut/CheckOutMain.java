package checkOut;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutMain {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<CheckOut> cart = new ArrayList<>();
        String more = "y";
        while (more.equalsIgnoreCase("y")) {
            System.out.print("Item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            cart.add(new CheckOut(itemName, price, quantity));

            System.out.print("Add more items? (y/n): ");
            more = scanner.nextLine();
        }

        System.out.println();
        System.out.println ("SEMICOLON STORE");

        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");

        System.out.println("TEL: 03293828343");
        System.out.println("SEMICOLON STORE");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Date: " + LocalDateTime.now().format(fmt));

        System.out.println("Enter cashier's Name: ");
        String name = scanner.nextLine();

        System.out.print("cashier," + name);
        System.out.println("Enter customer Name: ");

        String customer = scanner.nextLine();
        System.out.print("cashier," + customer);

        System.out.println("=============================================================");
        System.out.printf("%20s %5s %10s %14s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");

        System.out.println("---------------------------------------------------------------");
        for (CheckOut item : cart) {
            System.out.printf("%20s %5d %10.2f %14.2f%n",
                    item.getName(), item.getQuantity(), item.getPrice(), item.getTotal());
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------");

        double subtotal = CheckOut.calculationSubtotal(cart);
        System.out.printf("%38s %13.2f%n", "Sub Total:", subtotal);
            if(subtotal < 0){
                throw new IllegalArgumentException("it cant not be negative");
            }

        double discount = CheckOut.discount(subtotal);
        System.out.printf("%38s %13.2f%n", "Discount:", discount);

        double vat = CheckOut.vat(subtotal - discount);
        System.out.printf("%38s %13.2f%n", "VAT @ 17.50%:", vat);

        System.out.println();
        System.out.println("==================================================================");
        double total = CheckOut.total(cart);
        System.out.printf("%38s %13.2f%n", "Bill Total:", total);

        System.out.print("Amount Paid: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.printf("%38s %13.2f%n", "Amount Paid:", amount);
        if(amount < total){
            throw new IllegalArgumentException("You are short on bills");
        }

        double balance = amount - total;
            if(balance < 0){
                throw new IllegalArgumentException("You are short on bills");
            }
        System.out.printf("%38s %13.2f%n", "Balance:", balance);

        System.out.println();
        System.out.println("===================================================================");
        System.out.println("THANK YOU FOR YOUR PATRONAGE");
        System.out.println("===================================================================");


    }
}

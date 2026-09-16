package checkOut;

import java.util.ArrayList;

public class CheckOut {

    private static final double DISCOUNT_RATE = 0.075;
    private static final double VAT = 0.17;
    //    private static final double
    private String name;
    private double price;
    private int quantity;

    public CheckOut(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public static double total(ArrayList<CheckOut>cart) {
       double subtotal = calculationSubtotal(cart);
       double afterDiscount = subtotal - discount(subtotal);
       return afterDiscount + vat(afterDiscount);
    }

    public String getName() {

        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;}

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("price cannot be negative");
        }
        this.price = price;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            throw new IllegalArgumentException("quantity cannot be less than zero");
        }
        this.quantity = quantity;
    }

    public double getTotal() {
        return quantity * price;

    }
    @Override
    public String toString(){
        return String.format("%-15s Qty: %-5d price: #%-9f Total: #%.2f", name, quantity, price, getTotal());
    }

    public static double calculationSubtotal(ArrayList<CheckOut> cart) {
        double subtotal = 0;
        for(CheckOut checkOut : cart) {
            subtotal += checkOut.getTotal();
        }
        return subtotal;
    }


    public static double discount(double subtotal) {
        return subtotal * DISCOUNT_RATE;
    }

    public static double vat(double subtotal) {
        return subtotal * VAT;
    }
}

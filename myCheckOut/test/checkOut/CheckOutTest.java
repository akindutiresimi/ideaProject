package checkOut;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static checkOut.CheckOut.discount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckOutTest {
    CheckOut checkOut;
    @BeforeEach
    public void SetUp(){
        checkOut = new CheckOut("bottle water", 400 , 2);
    }

    @Test
    public void testThatTheProductBoughtByAClient(){
        assertEquals("bottle water", checkOut.getName());

    }

    @Test
    public void testThatTheProductTheCustomerBoughtIsSoSoAmount() {
        assertEquals(400, checkOut.getPrice());
    }

    @Test
    public void testThatTheProductTheCustomerPick() {
        assertEquals(2, checkOut.getQuantity());
    }

    @Test
    public void testThatTheCustomerPickMoreWater() {
        checkOut.setPrice(1000);
        assertEquals(1000,checkOut.getPrice());
    }

    @Test
    public void testThatTheCustomerPickAnotherProduct() {
        checkOut.setName("Spray");
        assertEquals("Spray", checkOut.getName());
    }

    @Test
    public void testThatTheCustomerPickSetOfSpray() {
        checkOut.setQuantity(7);
        assertEquals(7,checkOut.getQuantity());
    }

    @Test
    public void testTheCalculationOfAllGoodsBought() {
        assertEquals(800, checkOut.getTotal());
    }

    @Test
    public void testThatTheProductWhereAllGroupToAccordingItem() {
        ArrayList<CheckOut>cart = new ArrayList<>();
        cart.add(new CheckOut("bottle water", 400.0, 2));
        cart.add(new CheckOut("spray", 1000.0, 7));
        double subtotal = CheckOut.calculationSubtotal(cart);
        assertEquals(7800.0, subtotal);

    }

    @Test
    public void testThatTheProductWhereAllItemIsEmpty() {
        ArrayList<CheckOut>cart = new ArrayList<>();
        double subtotal = CheckOut.calculationSubtotal(cart);
        assertEquals(0, subtotal);
    }

    @Test
    public void testThatTheDiscountToTheProduct() {
        double discount = CheckOut.discount(800);
        assertEquals(60, discount);
    }

    @Test
    public void testThatTheDiscountWontFunctionWhenTheCustomerCartNoProduct() {
        double discount = CheckOut.discount(0);
        assertEquals(0,discount);
    }

    @Test
    public void testTheVatOfTheItemCartByTheCustomer() {
        double vat = CheckOut.vat(800);
        assertEquals(136, vat);
    }

    @Test
    public void testThatTheTotalAmountAfterDiscountHasBeenRemoveAndVatAsBeenAdded() {
        ArrayList<CheckOut>cart = new ArrayList<>();
        cart.add(new CheckOut("bottle water", 400.0, 2));
        cart.add(new CheckOut("spray", 1000, 7));

        double total = CheckOut.total(cart);
        assertEquals(8441.55, total);
    }

    @Test
    public void testThatTheTotalAmountAfterDiscountHasBeenRemoveAndVatAsBeenAddedToANewProduct() {
        ArrayList<CheckOut> cart = new ArrayList<>();
        cart.add(new CheckOut("milk", 2100.0, 2));
        cart.add(new CheckOut("spray", 550, 2));

        double total = CheckOut.total(cart);
        assertEquals(5735.925, total);
    }
}

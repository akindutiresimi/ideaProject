package cardValidatorTest;

import cardValidator.CardValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CardValidatorTest {

    CardValidator cardValidator;
    @BeforeEach
    public void setUp() {
        cardValidator = new CardValidator();
    }

    @Test
    public void testThatCreditCardMustHaveBetween13_To_16Digit() {
        cardValidator.setCardNumber(4388576018402626L);
        assertEquals(16, cardValidator.setCardNumber());


    }
}

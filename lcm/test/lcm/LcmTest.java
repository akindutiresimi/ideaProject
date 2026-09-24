package lcm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LcmTest {
    @Test
    public void testThatTheLcmOfAnArray() {
        int[] number = {8, 10, 24};
        int actual = Lcm.numbers(number);
        int expected = 120;
        assertEquals(expected, actual);

    }

}
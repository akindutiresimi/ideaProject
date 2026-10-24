package dairyTest;


import dairy.Dairies;
import dairy.Dairy;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DairiesTest {
    private Dairies dairies;

    @BeforeEach
    public void SetUp() {
        dairies = new Dairies();
    }

    @Test
    public void testThatICanAddADairyToDairies() {
        dairies.add("Johnny", "john");
        dairies.add("emma", "emman");
        assertEquals("kemi", dairies.findByUsername("kemi"));
    }
}

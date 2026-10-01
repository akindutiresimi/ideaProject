package dairyTest;

import dairy.Dairy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    private Dairy dairy;

    @BeforeEach
    public void SetUp() {
        dairy = new Dairy("Perez", "perezimo");
    }

    @Test
    public void testThatTheDiaryExit_AndHaveANameANPassword() {
        assertEquals("Perez", dairy.getName());
    }

    @Test
    public void testTHatTheDairyEntriesExist() {
        assertTrue(dairy.isEmpty());
    }

    @Test
    public void testThatThePasswordIsValid() {
        assertTrue(dairy.validatePassword("perezimo"));
    }

    @Test
    public void testThatThePasswordIsInCorrect() {
        assertEquals(false, dairy.validatePassword("perezi"));
    }

    @Test
    public void testThatAJourneyOfTheDayWasAddedToTheJourney() {
        dairy.write("My day");
        assertEquals("My day", dairy.entries().get(0));
    }

    @Test
    public void testThatICanAddMoreThanOneThingToMyDairy() {
        dairy.write("Secret");
        dairy.write("Stock to Invest In");
        dairy.write("What pain me today");
        assertEquals(List.of("Secret","Stock to Invest In","What pain me today"), dairy.entries());
    }

    @Test
    public void testThatMyDairyCanRemoveAJourneyAdded() {
        dairy.write("Secret");
        dairy.write("Stock to Invest In");
        dairy.write("What pain me today");
        dairy.remove("Stock to Invest In");
        assertEquals(List.of("Secret","What pain me today"), dairy.entries());
    }

    @Test
    public void testThatItTrulyRemoveAJourneyInTheDairy() {
        dairy.write("Secret");
        dairy.write("Stock to Invest In");
        dairy.write("What pain me today");
        assertTrue( dairy.remove("Stock to Invest In"));
    }

    @Test
    public void testThatItCanRemoveManyJourneyAtOnce() {
        dairy.write("Secret");
        dairy.write("Stock to Invest In");
        dairy.write("What pain me today");
        dairy.write("I love coding");
        dairy.write("The beauty of your worth");
        dairy.write("why you cried today");
        dairy.write("most painful day of Your life");
        assertTrue( dairy.remove("Stock to Invest In"));
        assertTrue(dairy.remove("The beauty of your worth"));
        assertTrue(dairy.remove("why you cried today"));
    }

}

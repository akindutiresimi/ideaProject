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
    public void testThatTheNewDairyIsNotLocked() {
        dairy.lockDairy();
        assertTrue(dairy.isLocked());
    }

    @Test
    public void testThatTheDairyIsUnlock() {
        dairy.lockDairy();
        assertTrue(dairy.unLocked("perezimo"));
    }

    @Test
    public void testThatTheWrongPasswordCantUnlockedTheDairy() {
        dairy.lockDairy();
        assertFalse(dairy.unLocked("samuel"));
        assertTrue(dairy.isLocked());
    }

    @Test
    public void testThatTheDiaryExit_AndHaveANameANPassword() {
        assertEquals("Perez", dairy.getUsername());
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
        dairy.createEntry("My day");
        assertEquals("My day", dairy.entries().get(0));
    }

    @Test
    public void testThatICanAddMoreThanOneThingToMyDairy() {
        dairy.createEntry("Secret");
        dairy.createEntry("Stock to Invest In");
        dairy.createEntry("What pain me today");
        assertEquals(List.of("Secret","Stock to Invest In","What pain me today"), dairy.entries());
    }

    @Test
    public void testThatMyDairyCanRemoveAJourneyAdded() {
        dairy.createEntry("Secret");
        dairy.createEntry("Stock to Invest In");
        dairy.createEntry("What pain me today");
        dairy.remove("Stock to Invest In");
        assertEquals(List.of("Secret","What pain me today"), dairy.entries());
    }

    @Test
    public void testThatItTrulyRemoveAJourneyInTheDairy() {
        dairy.createEntry("Secret");
        dairy.createEntry("Stock to Invest In");
        dairy.createEntry("What pain me today");
        assertTrue( dairy.remove("Stock to Invest In"));
    }

    @Test
    public void testThatItCanRemoveManyJourneyAtOnce() {
        dairy.createEntry("Secret");
        dairy.createEntry("Stock to Invest In");
        dairy.createEntry("What pain me today");
        dairy.createEntry("I love coding");
        dairy.createEntry("The beauty of your worth");
        dairy.createEntry("why you cried today");
        dairy.createEntry("most painful day of Your life");
        assertTrue( dairy.remove("Stock to Invest In"));
        assertTrue(dairy.remove("The beauty of your worth"));
        assertTrue(dairy.remove("why you cried today"));
    }

}

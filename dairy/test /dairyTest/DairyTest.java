package dairyTest;

import dairy.Dairy;

import dairy.Entry;
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
    public void testThaTheDairyIsLocked() {
        assertTrue(dairy.unLocked("perezimo"));
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
        dairy.createEntry(1, "My day", "Today was good");
        assertEquals("My day", dairy.entries().get(0).getTitle());
        assertEquals("Today was good", dairy.entries().get(0).getBody());
    }

    @Test
    public void testThatICanAddMoreThanOneThingToMyDairy() {
        dairy.createEntry(1, "Secret", "body 1");
        dairy.createEntry(2, "Stock to Invest In", "body 2");
        dairy.createEntry(3, "What pain me today", "body 3");

        List<Entry> entries = dairy.entries();
        assertEquals(3, entries.size());
        assertEquals("Secret", entries.get(0).getTitle());
        assertEquals("Stock to Invest In", entries.get(1).getTitle());
        assertEquals("What pain me today", entries.get(2).getTitle());
    }

    @Test
    public void testThatMyDairyCanRemoveAJourneyAdded() {
        dairy.createEntry(1, "Secret", "body 1");
        dairy.createEntry(2, "Stock to Invest In", "body 2");
        dairy.createEntry(3, "What pain me today", "body 3");
        dairy.deleteEntry(2);

        List<Entry> entries = dairy.entries();
        assertEquals(2, entries.size());
        assertEquals("Secret", entries.get(0).getTitle());
        assertEquals("What pain me today", entries.get(1).getTitle());
    }

    @Test
    public void testThatItTrulyRemoveAJourneyInTheDairy() {
        dairy.createEntry(1, "Secret", "body 1");
        dairy.createEntry(2, "Stock to Invest In", "body 2");
        dairy.createEntry(3, "What pain me today", "body 3");
        assertTrue(dairy.deleteEntry(2));
    }

    @Test
    public void testThatItCanRemoveManyJourneyAtOnce() {
        dairy.createEntry(1, "Secret", "body 1");
        dairy.createEntry(2, "Stock to Invest In", "body 2");
        dairy.createEntry(3, "What pain me today", "body 3");
        dairy.createEntry(4, "I love coding", "body 4");
        dairy.createEntry(5, "The beauty of your worth", "body 5");
        dairy.createEntry(6, "why you cried today", "body 6");
        dairy.createEntry(7, "most painful day of Your life", "body 7");
        assertTrue(dairy.deleteEntry(2));
        assertTrue(dairy.deleteEntry(5));
        assertTrue(dairy.deleteEntry(6));
    }

    @Test
    public void testThatICanFindEntryById() {
        dairy.createEntry(1, "Secret", "body 1");
        dairy.createEntry(2, "Stock to Invest In", "body 2");
        dairy.createEntry(3, "What pain me today", "body 3");
        dairy.createEntry(4, "I love coding", "body 4");

        Entry myEntry = dairy.entryById(3);

        assertEquals("What pain me today", myEntry.getTitle());
        assertEquals("body 3", myEntry.getBody());

    }

}

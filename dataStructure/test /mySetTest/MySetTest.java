package mySetTest;

import mySet.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void setUp() {
        mySet = new MySet();
    }

    @Test
    public void testThatTheNewSetIsEmpty() {
        assertTrue(mySet.isEmpty());
        assertEquals(0, mySet.size());
    }

    @Test
    public void testThaICanAddToTheSetAndItWillContainItem() {
        mySet.add("korede");
        assertTrue(mySet.contains("korede"));
        assertEquals(1, mySet.size());
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void testThatTheContainsReturnsFalseForMissingItem() {
        mySet.add("korede");
        assertFalse(mySet.contains("x"));
    }

    @Test
    public void testThatICanAddSeveralDifferentItemsToTheSet() {
        mySet.add("korede");
        mySet.add("emma");
        mySet.add("motu");
        assertEquals(3, mySet.size());
        assertTrue(mySet.contains("korede"));
        assertTrue(mySet.contains("emma"));
        assertTrue(mySet.contains("motu"));
    }

    @Test
    public void testThatICanRemoveAndDeletesExistingItemFromTheSet() {
        mySet.add("korede");
        mySet.add("emma");
        mySet.remove("korede");
        assertFalse(mySet.contains("korede"));
        assertTrue(mySet.contains("emma"));
        assertEquals(1, mySet.size());
    }

    @Test
    public void testThatICanReAddAfterRemoveAnItemFromTheSet() {
        mySet.add("korede");
        mySet.remove("korede");
        mySet.add("korede");
        assertEquals(1, mySet.size());
        assertTrue(mySet.contains("korede"));
    }


    @Test
    public void testThatTheSetContainsNullAndReturnsFalse() {
        mySet.add("korede");
        assertFalse(mySet.contains(null));
    }

    @Test
    public void testThatICanClearAndRemovesEverythingInTheSet() {
        mySet.add("korede");
        mySet.add("limus");
        mySet.clear();
        assertTrue(mySet.isEmpty());
        assertEquals(0, mySet.size());
        assertFalse(mySet.contains("korede"));
    }
}

package linkedLIstTest;

import mylinkedList.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    private MyLinkedList list;

    @BeforeEach
    public void startWith() {
        list = new MyLinkedList();
    }

    @Test
    public void testThatListIsEmpty() {
        assertTrue(list.IsEmpty());
    }

    @Test
    public void testThatANEwListIsHasASize() {
        assertEquals(0, list.size());
    }

    @Test
    public void testThatAddAWordToTheListWhichMakeITNOtEmpty() {
        list.add("ayomide");
        assertFalse(list.IsEmpty());
        assertEquals(1, list.size());
    }

    @Test
    public void testThatAddTwoWordToTheListWhichMakeITNOtEmpty() {
        list.add("ayomide");
        list.add("samuel");
        assertFalse(list.IsEmpty());
        assertEquals(2, list.size());
    }

    @Test
    public void testThatICanGetTheWOrdInTheFirstIndex() {
        list.add("samuel");
        assertEquals("samuel", list.get(0));
    }

    @Test
    public void testThatICanGetMoreWordIndex() {
        list.add("samuel");
        list.add("ayomide");
        list.add("pelumi");
        assertEquals("ayomide", list.get(1));
        assertEquals("samuel", list.get(0));
    }

//    @Test
//    public void testThatICanPopOutAWordFromTheList() {
//        list.add("samuel");
//        list.add("ayomide");
//        list.add("pelumi");
//        assertEquals("pelumi", list.pop());
//    }
}

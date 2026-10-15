package myQueueTest;

import myQueue.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyQueueTest {
    private MyQueue myQueue;

    @BeforeEach
    public void startWith() {
        myQueue = new MyQueue();
    }

    @Test
    public void testThatTheQueueIsEmpty() {

        assertEquals(true, myQueue.isEmpty());
    }

    @Test
    public void testThatTheQueueIsEmpty_AddOneThingTOTheEmptyQueue() {

        assertEquals(true, myQueue.isEmpty());

        myQueue.add("samuel");
        assertEquals(false, myQueue.isEmpty());
    }

    @Test
    public void testThatIRemoveAnElementFromTheArray() {

        myQueue.add("second");
        myQueue.add("third");
        myQueue.add("fourth");

        myQueue.remove("second");
        assertEquals(false, myQueue.isEmpty());

    }

    @Test
    public void testThatRemoveAnElementFromAnEmptyArrayShouldThroughAnExpection() {

        assertThrows(IllegalArgumentException.class,() -> myQueue.remove("samuel"));

    }

    @Test
    public void testThatIAddAnElement() {
        myQueue.add("first");
        assertEquals(1, myQueue.size());
    }

    @Test
    public void testThatICanAddMoreToTheQueue() {
        myQueue.add("second");
        myQueue.add("third");
        myQueue.add("fourth");
        assertEquals(3, myQueue.size());
    }

    @Test
    public void testTHatICanRemoveFromTheQueue() {
        myQueue.add("second");
        myQueue.add("third");
        myQueue.add("fourth");
        assertEquals(3, myQueue.size());
    }


}

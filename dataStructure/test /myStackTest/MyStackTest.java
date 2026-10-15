package myStackTest;

import myStack.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    private MyStack myStack;

    @BeforeEach
    public void startWith() {
        myStack = new MyStack();
    }

    @Test
    public void testThatTheStackIsEmpty() {

        assertEquals(true, myStack.isEmpty());
    }

    @Test
    public void testThatTheStackIsEmpty_PushAWordInTheStack() {

        assertEquals(true, myStack.isEmpty());

        myStack.push("samuel");
        assertEquals(false, myStack.isEmpty());

    }

    @Test
    public void testThatIPushAWord_IAlsoPopTheStackEmpty() {

        assertEquals(true, myStack.isEmpty());

        myStack.push("samuel");
        assertEquals(false, myStack.isEmpty());

        myStack.pop();
        assertEquals(true, myStack.isEmpty());

    }


    @Test
    public void testThatIPushAWord_AndThatIAlsoPushAnotherWord() {

        assertEquals(true, myStack.isEmpty());

        myStack.push("samuel");
        assertEquals(false, myStack.isEmpty());

        myStack.push("Aderonke");
        assertEquals(false, myStack.isEmpty());

    }


    @Test
    public void testThatIPushAWord_AndThatIAlsoPushAnotherWord_AndThatIPopTheTwoWord() {

        myStack.push("samuel");

        myStack.push("Aderonke");
        assertEquals(false, myStack.isEmpty());

        assertEquals("Aderonke", myStack.pop());

        assertEquals("samuel", myStack.pop());

    }


    @Test
    public void testThatIPushAWord_AndThatIAlsoPushAnotherWord_AndThatIPeekAtTheWordAtTheTopOfStack() {

        myStack.push("samuel");
        myStack.push("Aderonke");

        assertEquals("Aderonke", myStack.peek());


    }

    @Test
    public void testThatIPushAWord_AndThatIAlsoPushAnotherWord_AndThatISearchAtTheWordAtTheTopOfStack() {

        myStack.push("samuel");
        myStack.push("Aderonke");

        assertEquals(1, myStack.search("Aderonke"));


    }
}

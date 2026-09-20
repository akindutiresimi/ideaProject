package arrayList;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListsTest {
    @Test
    public void testThatTheArrayListIsEmpty() {

        ArrayLists myArrayList = new ArrayLists();
        assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void testThatTheArrayListTakeInString() {

        ArrayLists myArrayList = new ArrayLists();
        myArrayList.add("bus");
    }
}

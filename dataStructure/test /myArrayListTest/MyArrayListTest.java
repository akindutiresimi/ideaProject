package myArrayListTest;

import myArrayList.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private MyArrayList list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList();
    }

    @Test
    public void testThatNewListIsEmpty() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testThatICanAddAndKeepInsertionOrder() {
        list.add("boat");
        list.add("car");
        list.add("keke");
        assertEquals(3, list.size());
        assertEquals("boat", list.get(0));
        assertEquals("car", list.get(1));
        assertEquals("keke", list.get(2));
    }

    @Test
    public void testThatWhenNotTheRightIndexThrowAnExpection() {
        list.add("boat");
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void tetsThatICanReplacesItemInTheMyArrayList() {
        list.add("boat");
        list.add("car");
        list.set(0, "vehicle");
        assertEquals("vehicle", list.get(0));
        assertEquals("car", list.get(1));
        assertEquals(2, list.size());
    }

    @Test
    public void testThatICanRemoveAndDeletesFromTheArrayList() {
        list.add("boat");
        list.add("car");
        list.add("keke");
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("boat", list.get(0));
        assertEquals("keke", list.get(1));
    }

    @Test
    public void testThatICanClearAndRemovesEverythingInAnArrayList() {
        list.add("boat");
        list.add("car");
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

}

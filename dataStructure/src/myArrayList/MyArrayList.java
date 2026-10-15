package myArrayList;

import java.util.Arrays;

public class MyArrayList {

    private static final int INITIAL_CAPACITY = 60;

    private Object[] items;
    private int size;

    public MyArrayList() {
        items = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(String item) {
        items[size] = item;
        size++;
    }

    public String get(int index) {
        checkIndex(index);
        return (String) items[index];
    }

    public void set(int index, String item) {
        checkIndex(index);
        items[index] = item;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int count = index; count < size - 1; count++) {
            items[count] = items[count + 1];
        }
        size--;
        items[size] = null;
    }

    public void clear() {
        Arrays.fill(items, 0, size, null);
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + ", size " + size);
        }
    }
}
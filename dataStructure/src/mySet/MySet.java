package mySet;

import java.util.Arrays;

public class MySet {
    private static final int INITIAL_CAPACITY = 5;

    private Object[] items;
    private int size;

    public MySet() {
        items = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(String item) {
        if (contains(item)) {
            return;
        }
        items[size] = item;
        size++;
    }

    public void remove(String item) {
        int index = indexOf(item);
        if (index == -1) {
            return;
        }
        size--;
        items[index] = items[size];
        items[size] = null;
    }


    public void clear() {
        Arrays.fill(items, 0, size, null);
        size = 0;
    }

    public boolean contains(String item) {
        return indexOf(item) != -1;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int indexOf(String item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

}

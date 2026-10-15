package myMap;

public class MyMap {
    private String[] keys = new String[100];
    private int[] values = new int[100];
    private int size = 0;

    public void put(String key, int value) {
        keys[size] = key;
        values[size] = value;
        size++;

    }
    public int size() {
        return size;
    }
    public Integer get(String key) {
        for(int count = 0; count < size; count++){
            if(keys[count].equals(key)){
                return values[count];
            }
        }
        return null;
    }

    public Integer remove(String key) {
        for(int count = 0; count < size; count++){
            if(keys[count].equals(key)){
                int removedValue = values[count];

                for(int next = count; next < size - 1; next++) {
                    keys[next]  = keys[next + 1];
                }
                keys[size - 1] = null;
                size--;
                return removedValue;
            }
        }
        return null;
    }
}

package stackFolder;

public class Stack {
    private int count;
    ;

    private String[] stackArray = new String[5];


    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String element) {
        stackArray[count++] = element;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is Empty");
        }
        return stackArray[--count];
    }

    public String peek() {
        return stackArray[count - 1];
    }

    public int search(String element) {

        for (int index = 0; index < stackArray.length; index++) {
            if (stackArray[index] == element) {;
                return index;
            }
        }
        return -1;
    }
}

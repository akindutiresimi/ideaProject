package myStack;

public class MyStack {
    private int count;

    private String[] myStackArray = new String[30];

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String element) {
        myStackArray[count++] = element;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is Empty");
        }
        return myStackArray[--count];
    }

    public String peek() {
        if(isEmpty()){
            throw new  IllegalArgumentException("stack is Empty");
        }
        return myStackArray[count - 1];
    }

    public int search(String element) {
        for (int index = 0; index < count; index++) {
            if (myStackArray[index].equals(element)) {
                return index;
            }
        }
        return -1;
    }
}

package myQueue;

public class MyQueue {
    private int count;

    public String[] myQueue = new String[30];

    public boolean isEmpty() {
        return count == 0;

    }
    public int size() {
        return count;
    }

    public void add(String element) {
        boolean isFull = true;

        for(int count = 0; count < myQueue.length; count++) {
            if (myQueue[count] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull)
            throw new IllegalArgumentException("queue is full");

        myQueue[count++] = element;

    }


    public String remove(String element) {
        if(isEmpty()){
            throw new IllegalArgumentException("cant remove from an empty queue");
        }
        String removedElement = myQueue[0];

        for(int index = 0; index < count; index++){
            myQueue[index] = myQueue[index + 1];
        }
        myQueue[count - 1] = null;
        count--;
        return removedElement;
    }
}

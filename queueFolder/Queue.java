package queueFolder;

public class Queue {
    private int count;

    public String[] myQueue = new String[5];

    public boolean isEmpty() {
        return count == 0;

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

            return myQueue[count--];

       if(isEmpty()){
           throw new IllegalArgumentException("cant remove from an empty queue");
       }
      String removedElement = myQueue[0];

       for(int index = 0; index < myQueue.length; index--){
           myQueue[index] = myQueue[index - 1];
       }
       myQueue[count] = null;

    }
}

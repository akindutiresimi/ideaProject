package mylinkedList;

public class MyLinkedList {

    private class Node {
        String data ;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public boolean IsEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public void add(String word) {
        Node newNode = new Node(word);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public String get(int index) {
        Node current = head;
        for(int count = 0; count < index; count++){
            current = current.next;
        }
        return current.data;
    }

//    public String pop() {
//
//    }

}



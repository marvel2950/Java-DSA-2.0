public class LinkedlistImpl {
    private class Node {
        int val;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void addAtFirst(int item) {
        Node nn = new Node(); // nn -> new node
        nn.val = item;
        if (size == 0) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }
}


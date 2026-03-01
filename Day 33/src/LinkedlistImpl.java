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

    public void addAtLast(int item) {
        if (size == 0) {
            addAtFirst(item);
        } else {
            Node nn = new Node(); // nn -> new node
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public int getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Linked List is empty!");
        }
        return head.val;
    }

    public int getLast() throws Exception {
        if (size == 0) {
            throw new Exception("Linked List is empty!");
        }
        return tail.val;
    }

    public int removeFromFirst() throws Exception {
        if (size == 0) {
            throw new Exception("Linked List is empty!");
        } else if (size == 1) {
            Node rn = head; // rn -> removed node
            head = null;
            tail = null;
            size--;
            rn.next = null;
            return rn.val;
        } else {
            Node rn = head;
            head = head.next;
            size--;
            rn.next = null;
            return rn.val;
        }
    }

    public int removeFromLast() throws Exception {
        if (size == 0) {
            return removeFromFirst();
        } else if (size == 1) {
            return removeFromFirst();
        } else {
            Node sl = getNode(size - 2);
            Node rn = tail;
            sl.next = null;
            tail = sl;
            size--;
            return rn.val;
        }
    }

    private Node getNode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int getIndex(int k) throws Exception {
        if (size == 0) {
            throw new Exception("Linked List is empty!");
        }
        return getNode(k).val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void addAtIndex(int idx, int item) throws Exception {
        if (idx == 0) {
            addAtFirst(item);
        } else if (idx == size - 1) {
            addAtLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node ln = getNode(idx - 1); // ln -> last node
            Node next = ln.next;
            ln.next = nn;
            nn.next = next;
            size++;
        }
    }


}


public class MiddleOfLinkedList {
    public static void main(String args[]) {
        LinkedListImpl list = new LinkedListImpl();

//        list.addAtFirst(1);
        list.addAtFirst(2);
        list.addAtFirst(3);
        list.addAtFirst(4);
        list.addAtFirst(5);

        Node head = list.head;

        list.display();

        System.out.println(getLength(head));
        System.out.println(getMiddle1(head).val);
        System.out.println(getMiddle2(head).val);
    }

    public static int getLength(Node head) {
        Node temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public static Node getMiddle1(Node head) {
        Node cur = head;
        int len = getLength(head);
        int mid = len/2; // 2

        int ind = 0;
        while(ind != mid) {
           ind++;
           cur = cur.next;
        }
        return cur;
    }

    public static Node getMiddle2(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

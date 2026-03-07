public class Solution {

    public static int getLength(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = getLength(headA);
        int l2 = getLength(headB);

        if(headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        int diff = 0;

        if(l1 > l2) {
            diff = l1 - l2;
            while(diff != 0) {
                a = a.next;
                diff--;
            }
        } else {
            diff = l2 - l1;
            while(diff != 0) {
                b = b.next;
                diff--;
            }
        }

        while(a != null && b != null) {
            if(a == b) return a;
            a = a.next;
            b = b.next;
        }

        return null;
    }
}
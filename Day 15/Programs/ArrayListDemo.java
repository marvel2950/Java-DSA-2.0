import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> ll = new ArrayList<>();

        System.out.println(ll);
        System.out.println(ll.size());

        // add
        ll.add(10);
        ll.add(3);
        ll.add(20);
        ll.add(4);
        ll.add(16);

        System.out.println(ll);
        System.out.println(ll.size());

        // insert -2 at index 3
        ll.add(3, -2);

        System.out.println(ll);
        System.out.println(ll.size());

        System.out.println(ll.get(4));
//        System.out.println(ll.get(7)); // IndexOutOfBoundsException

        System.out.println(ll.remove(3));

        System.out.println(ll);
        System.out.println(ll.size());

        ll.set(2, 100);

        System.out.println(ll);
        System.out.println(ll.size());

        Collections.sort(ll);
        System.out.println(ll);

        Collections.reverse(ll);
        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();

        int[] arr = new int[5];
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : ll) { //unboxing
            System.out.print(i + " ");
        }
        System.out.println();

        for (Integer i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

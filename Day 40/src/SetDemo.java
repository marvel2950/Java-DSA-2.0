import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String args[]) {
        HashSet<Integer>  set = new HashSet<>();

        System.out.println(set.add(1));
        System.out.println(set.add(1));
        set.add(11);
        set.add(90);

        set.add(43);
        set.add(43);
        set.add(43);
        set.add(43);
        set.add(43);

        set.add(22);
        set.add(211);
        set.add(432);
        set.add(902);
        set.add(121);
        set.add(2111);

        System.out.println(set);

        System.out.println(set.contains(78));
        System.out.println(set.contains(22));

        System.out.println(set.remove(22));
        System.out.println(set.contains(22));

        System.out.println(set);
        System.out.println();


        TreeSet<Integer> set1 = new TreeSet<>();

        set1.add(1);
        set1.add(11);
        set1.add(90);

        set1.add(43);
        set1.add(43);
        set1.add(43);
        set1.add(43);
        set1.add(43);

        set1.add(22);
        set1.add(211);
        set1.add(432);
        set1.add(902);
        set1.add(121);
        set1.add(2111);

        System.out.println(set1);

        System.out.println(set1.contains(78));
        System.out.println(set1.contains(22));

        System.out.println(set1.remove(22));
        System.out.println(set1.contains(22));

        System.out.println(set1);
        System.out.println();


        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.add(1);
        set2.add(11);
        set2.add(90);

        set2.add(43);
        set2.add(43);
        set2.add(43);
        set2.add(43);
        set2.add(43);

        set2.add(22);
        set2.add(211);
        set2.add(432);
        set2.add(902);
        set2.add(121);
        set2.add(2111);

        System.out.println(set2);

        System.out.println(set2.contains(78));
        System.out.println(set2.contains(22));

        System.out.println(set2.remove(22));
        System.out.println(set2.contains(22));

        System.out.println(set2);
        System.out.println();

        for(int val : set) {
            System.out.print(val + " ");
        }
        System.out.println();

        for(int val : set1) {
            System.out.print(val + " ");
        }
        System.out.println();

        for(int val : set2) {
            System.out.print(val + " ");
        }
        System.out.println();


    }
}

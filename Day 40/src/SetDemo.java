import java.util.HashSet;

public class SetDemo {
    public static void main(String args[]) {
        HashSet<Integer>  set = new HashSet<>();

        set.add(1);
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

    }
}

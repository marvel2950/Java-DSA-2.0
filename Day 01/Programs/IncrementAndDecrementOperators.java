public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int a = 6;

        a++; // a = a + 1;

        System.out.println(a); // a = 7

        System.out.println(a++);

        System.out.println(a); // a = 8

        System.out.println(++a); // a = 9

        int x = 8;
        int c = x++ - ++x;
        System.out.println(c);

        System.out.println(x);
        c = x++ - ++x + --x + x--;
        System.out.println(c);

        System.out.println(x);
        // c = x++ -( ++x + --x) + x--;
        // System.out.println(c);

        c = x++ - (x + x) + x--;
        System.out.println(c);

    }
}
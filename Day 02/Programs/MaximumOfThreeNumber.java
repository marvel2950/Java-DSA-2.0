public class MaximumOfThreeNumber {
    public static void main(String[] args) {
        int a = 17;
        int b = 11;
        int c = 15;
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }

}
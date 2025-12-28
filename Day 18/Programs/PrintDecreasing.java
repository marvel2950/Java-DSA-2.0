public class PrintDecreasing {
    public static void main(String args[]) {
        int n = 4;
        printDecr(n);
    }

    private static void printDecr(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecr(n-1);
    }

}

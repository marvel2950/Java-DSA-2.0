public class PrintIncreasing {
    public static void main(String args[]) {
        int n = 4;
        printIncr(n);
    }

    private static void printIncr(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printIncr(n-1);
        System.out.println(n);
    }
}

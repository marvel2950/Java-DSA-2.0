public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int space = n - 1;
        int star = n;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            space--;
            row++;
        }
    }

}

package Programs;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        int space = 2 * n - 1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= star) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            row++;
            space = space - 2;
            star++;
        }
    }
}

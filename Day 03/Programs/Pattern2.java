package Programs;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while (row <= n) {
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            row++;
            star++;
        }
        sc.close();
    }

}
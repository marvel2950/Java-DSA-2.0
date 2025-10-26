package Programs;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n) {
            int i = 1;
            if (row == 1 || row == n) {
                while (i <= n) {
                    System.out.print("* ");
                    i++;
                }
            } else {
                while (i <= n) {
                    if (i == 1 || i == n) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    i++;
                }
            }

            System.out.println();
            row++;
        }

        sc.close();
    }
}

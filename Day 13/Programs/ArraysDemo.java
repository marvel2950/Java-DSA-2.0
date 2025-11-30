import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[][] other = arr;
        System.out.println(other);

        // rows
        System.out.println(arr.length);

        // cols
        System.out.println(arr[0].length);

        System.out.println("Hello Akarsh!");

//        int[][] brr = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };

        Scanner sc = new Scanner(System.in);

//        int row = sc.nextInt();
//        int col = sc.nextInt();
//        int[][] brr = new int[row][col];

//        for (int i = 0; i < brr.length; i++) {
//            for (int j = 0; j < brr[0].length; j++) {
//                brr[i][j] = sc.nextInt();
//            }
//        }

//        for (int i = 0; i < brr.length; i++) {
//            for (int j = 0; j < brr[0].length; j++) {
//                System.out.print(brr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int[][] jagged = {
                {1},
                {2, 3, 4},
                {5, 6}
        };

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }


    }
}

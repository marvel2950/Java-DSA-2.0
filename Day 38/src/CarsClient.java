import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CarsClient {
    public static void main(String args[]) {
        Cars[] arr = new Cars[5];

        arr[0] = new Cars(200, 10, "White");
        arr[1] = new Cars(1000, 20, "Black");
        arr[2] = new Cars(345, 3, "Yellow");
        arr[3] = new Cars(34, 89, "Grey");
        arr[4] = new Cars(8907, 6, "Red");

        display(arr);

        System.out.println();

//        bubbleSort(arr);
//
//        Arrays.sort(arr, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars c1, Cars c2) {
//                return c1.price - c2.price;
//            }
//        });
//
//        Arrays.sort(arr, new Comparator<Cars>() {
//            @Override
//            public int compare(Cars c1, Cars c2) {
//                return c1.speed - c2.speed;
//            }
//        });

        Arrays.sort(arr);
        display(arr);
    }

//    public static void bubbleSort(Cars[] arr) {
//        int n = arr.length;
//        for(int turn=1; turn < n; turn++) {
//            for(int i=0; i < n-turn; i++) {
//                if(arr[i].price > arr[i+1].price) {
//                    // swap arr[i], arr[i+1]
//                    Cars temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//    }

    public static void bubbleSort(Cars[] arr) {
        int n = arr.length;
        for(int turn=1; turn < n; turn++) {
            for(int i=0; i < n-turn; i++) {
                if(arr[i].compareTo(arr[i+1]) > 0) {
                    // swap arr[i], arr[i+1]
                    Cars temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }



    public static void display(Cars[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

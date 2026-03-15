public class Demo {
    public static void main(String[] args) {
        Integer[] arr1 = { 10, 20, 30, 40, 50 };
        display(arr1);

        String[] arr2 = { "Raj", "Ankit", "Kaju", "Ankita", "Rajesh" };
        display(arr2);
    }

//    public static void display(Integer[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void display(String[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }

    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


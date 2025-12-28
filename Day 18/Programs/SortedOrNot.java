public class SortedOrNot {
    public static void main(String args[]) {
        int[] arr = {1, 2, 5, 4, 3, 4, 7, 4, 3, 6};
        int i = 0;
        System.out.println(sortedOrNot(arr, i));
    }

    private static boolean sortedOrNot(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sortedOrNot(arr, i + 1);
    }

}

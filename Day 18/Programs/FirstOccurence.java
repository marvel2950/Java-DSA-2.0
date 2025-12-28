public class FirstOccurence {
    public static void main(String args[]) {
        int[] arr = {1, 2, 5, 4, 3, 4, 7, 4, 3, 6};
        int item = 4;
        int i = 0;
        System.out.println(linearSearchImpl(arr, item, i));
    }

    private static int linearSearchImpl(int[] arr, int item, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item) {
            return i;
        }
        return linearSearchImpl(arr, item, i + 1);
    }

}

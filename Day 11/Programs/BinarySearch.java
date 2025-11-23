public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 11, 13, 16, 17, 18};
        int item = 13;
        System.out.println(binarySearch(arr, item));
        System.out.println(binarySearch(arr, item, 0, arr.length-1));
    }

    public static int binarySearch(int[] arr, int item) {
        int n = arr.length;

        int low = 0;
        int high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            else if (arr[mid] > item) { // 1st Array => left Array
                high = mid - 1;
            }
            else if(arr[mid] < item) { // 2nd Array => right Array
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int item, int low, int high) {
        int n = arr.length;

        while(low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            }
            else if (arr[mid] > item) { // 1st Array => left Array
                high = mid - 1;
            }
            else if(arr[mid] < item) { // 2nd Array => right Array
                low = mid + 1;
            }
        }
        return -1;
    }

}

public class QuickSort {
    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 4, 1};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int partitionIdx = partition(arr, si, ei);
        quickSort(arr, si, partitionIdx - 1); // 1st half
        quickSort(arr, partitionIdx + 1, ei); // 2nd half
    }

    static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < pivot) {
                // swap => arr[i], arr[idx]
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        // swap => arr[idx], pivot(arr[ei])
        int temp = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = temp;

        return idx;
    }
}

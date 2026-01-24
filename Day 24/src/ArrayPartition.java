public class ArrayPartition {
    public static void main(String args[]) {
        int[] arr = {5, 7, 2, 1, 8, 3, 4};
        int si = 0;
        int ei = arr.length - 1;
        System.out.println(partition(arr, si, ei));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

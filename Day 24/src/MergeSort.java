public class MergeSort {
    public static void main(String args[]) {
        int[] arr = {7, 5, 2, 4, 1};
        int[] a = mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = {arr[si]};
            return bs;
        }
        int mid = (si + ei) / 2;
        int[] first = mergeSort(arr, si, mid); // 1st part
        int[] second = mergeSort(arr, mid + 1, ei); // 2nd part
        return merged(first, second);
    }

    private static int[] merged(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] arr = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

}

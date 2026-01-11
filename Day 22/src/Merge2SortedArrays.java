public class Merge2SortedArrays {
    public static void main(String args[]) {
        int[] arr1 = {2, 3, 5};
        int[] arr2 = {1, 3, 6, 7, 8};
        int[] arr = merged(arr1, arr2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

        while(i < n) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < m) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }


}

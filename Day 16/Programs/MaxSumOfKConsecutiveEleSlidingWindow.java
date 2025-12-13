public class MaxSumOfKConsecutiveEleSlidingWindow {
    public static void main(String args[]) {
        int[] arr = {2, 3, 5, 1, 5, 7, 8, 9, 1};
        int k = 3;

        System.out.println(maximumSum(arr, k));
    }

    private static int maximumSum(int[] arr, int k) {
        int n = arr.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        int maxSum = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i-k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

}


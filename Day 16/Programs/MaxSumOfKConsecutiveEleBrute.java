public class MaxSumOfKConsecutiveEleBrute {
    public static void main(String args[]) {
        int[] arr = {2, 3, 5, 1, 5, 7, 8, 9, 1};
        int k = 3;

        System.out.println(maximumSumBrute(arr, k));
    }

    private static int maximumSumBrute(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        System.out.println(maxSum);

        for (int i = 0; i <= n - k; i++) {
            int curSum = 0;
            for (int j = i; j < i + k; j++) {
                curSum = curSum + arr[j];
//                System.out.print(arr[j] + " ");
            }
//            System.out.println(curSum);
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

}

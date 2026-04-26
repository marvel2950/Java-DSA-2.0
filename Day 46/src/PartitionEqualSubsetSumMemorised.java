class Solution {
    Boolean[][] dp;

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }

        if(sum %2 != 0) {
            return false;
        }

        int w = sum/2;
        int n = nums.length;

        dp = new Boolean[n+1][w+1];

        return knapsackRecursive(nums, w, n);
    }

    boolean knapsackRecursive(int[] wt, int w, int n) {
        if (w == 0) {
            return true;
        }
        if(n == 0) {
            return false;
        }

        if(dp[n][w] != null) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) { // include and not include (item wt less than bag wt)
            dp[n][w] = knapsackRecursive(wt, w - wt[n - 1], n - 1) || // include item[n-1] in bag
                    knapsackRecursive(wt, w, n - 1); // not include item[n-1] in bag

        } else { // not include (item wt greater than bag wt)
            dp[n][w] = knapsackRecursive(wt, w, n - 1); // not include item[n-1] in bag
        }
        return dp[n][w];
    }
}
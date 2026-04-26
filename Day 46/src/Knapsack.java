public class Knapsack {

    private static int knapsackRecursive(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (wt[n - 1] <= w) { // include and not include (item wt less than bag wt)
            return Math.max(
                    val[n - 1] + knapsackRecursive(wt, val, w - wt[n - 1], n - 1), // include item[n-1] in bag
                    knapsackRecursive(wt, val, w, n - 1) // not include item[n-1] in bag
            );

        } else { // not include (item wt greater than bag wt)
            return knapsackRecursive(wt, val, w, n - 1); // not include item[n-1] in bag
        }
    }

    private static int knapsackMemorised(int[] wt, int[] val, int w, int n, int[][] dp) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (dp[n][w] != -1) {
            return dp[n][w];
        }

        if (wt[n - 1] <= w) { // include and not include (item wt less than bag wt)
            dp[n][w] = Math.max(
                    val[n - 1] + knapsackMemorised(wt, val, w - wt[n - 1], n - 1, dp), // include item[n-1] in bag
                    knapsackMemorised(wt, val, w, n - 1, dp) // not include item[n-1] in bag
            );

        } else { // not include (item wt greater than bag wt)
            dp[n][w] = knapsackMemorised(wt, val, w, n - 1, dp); // not include item[n-1] in bag
        }
        return dp[n][w];
    }


    public static void main(String args[]) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int w = 7;
        int n = wt.length;

        System.out.println(knapsackRecursive(wt, val, w, n));

        int[][] dp = new int[n + 1][w + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsackMemorised(wt, val, w, n, dp));


    }


}

import java.util.Arrays;

public class FibonacciAll {
    public static int fibRec(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static int fibMem(int n, int[] dp) {
        if (dp[n] != -1) return dp[n];
        if (n == 1) {
            dp[n] = 0;
            return 0;
        }
        if (n == 2) {
            dp[n] = 1;
            return 1;
        }
        dp[n] = fibMem(n - 1, dp) + fibMem(n - 2, dp);
        return dp[n];
    }

    public static int fibTab(int n) {
        int[] dp = new int[n + 1];
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        dp[1] = 0;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String args[]) {
        System.out.println("Hello Akarsh");

        int n = 7;
        System.out.println(fibRec(n));

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibMem(n, dp));

        System.out.println(fibTab(n));


    }
}

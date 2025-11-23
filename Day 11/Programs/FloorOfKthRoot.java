public class FloorOfKthRoot {
    public static void main(String args[]) {
        int n = 149;
        int k = 3;
        System.out.println(kthRootLinear(n, k));
        System.out.println(kthRootBinary(n, k));
    }

    private static int kthRootLinear(int n, int k) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            double power = Math.pow(i, k);
            if (power <= n) {
                ans = i;
            } else {
                break;
            }
        }
        return ans;
    }

    private static int kthRootBinary(int n, int k) {
        int low = 1;
        int high = n;

        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

}

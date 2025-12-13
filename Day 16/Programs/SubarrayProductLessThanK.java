public class SubarrayProductLessThanK {
    public static void main(String args[]) {
        int[] arr = {1, 2, 1, 3, 4, 2};
        int k = 10;

        System.out.println(subarrayProduct(arr, k));
    }

    private static int subarrayProduct(int[] arr, int k) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int prod = 1;
        int n = arr.length;

        while (end < n) {
            // Grow
            prod = prod * arr[end];

            // Shrink
            while(prod >= k && start<=end) {
                prod = prod/arr[start];
                start++;
            }

            int size = (end-start +1);
            ans = ans + size;

            end++;
        }
        return ans;
    }
}

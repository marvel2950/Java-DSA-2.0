class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = n - 1;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                end1 = i;
                start2 = i + 1;
            }
        }

        System.out.println(start1 + " " + end1 + " " + start2 + " " + end2);

        int ans = binarySearch(nums, target, start1, end1);
        if(ans == -1) {
            ans = binarySearch(nums, target, start2, end2);
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int item, int low, int high) {
        int n = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) { // 1st Array => left Array
                high = mid - 1;
            } else if (arr[mid] < item) { // 2nd Array => right Array
                low = mid + 1;
            }
        }
        return -1;
    }
}
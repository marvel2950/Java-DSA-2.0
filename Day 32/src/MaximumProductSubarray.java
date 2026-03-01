class Solution {
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int ans = nums[0];

        for(int i=1; i<nums.length; i++) {
            int num = nums[i];

            int tempMax = Math.max(num, Math.max(num*curMax, num*curMin));
            int tempMin = Math.min(num, Math.min(num*curMax, num*curMin));

            curMax = tempMax;
            curMin = tempMin;

            ans = Math.max(ans, curMax);
        }
        return ans;

    }
}
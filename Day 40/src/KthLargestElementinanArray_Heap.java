class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue < Integer > maxPQ = new PriorityQueue < > (Collections.reverseOrder());
        for (int num: nums) {
            maxPQ.add(num);
        }
        for (int i = 0; i < k - 1; i++) {
            maxPQ.poll(); // remove the largest
        }
        return maxPQ.peek(); // kth largest

    }
}
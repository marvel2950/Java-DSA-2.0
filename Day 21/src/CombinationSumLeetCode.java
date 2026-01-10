class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
        combination2(candidates, target, 0, ans, 0, finalAns);
        return finalAns;
    }

    private static void combination2(int[] coin, int amount, int total, List<Integer> ans, int idx, List<List<Integer>> finalAns) {
        if (amount == total) {
            System.out.println(ans);
            finalAns.add(new ArrayList<>(ans));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount - total >= coin[i]) {
                ans.add(coin[i]);
                combination2(coin, amount, total + coin[i], ans, i, finalAns);
                ans.remove(ans.size() -1 ); // backtrack
            }
        }
    }
}
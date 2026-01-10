import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String args[]) {
        int[] coin = {1, 2, 4};
        int amount = 6;
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> finalAns = new ArrayList<>();
//        combination1(coin, amount, 0, ans, 0);
        combination2(coin, amount, 0, ans, 0, finalAns);
        System.out.println(finalAns);
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

//    private static void combination1(int[] coin, int amount, int total, List<Integer> ans, int idx) {
//        if (amount == total) {
//            System.out.println(ans);
//            return;
//        }
//        for (int i = idx; i < coin.length; i++) {
//            if (amount - total >= coin[i]) {
//                List<Integer> tempList = new ArrayList<>(ans);
//                tempList.add(coin[i]);
//                combination1(coin, amount, total + coin[i], tempList, i);
//            }
//        }
//    }

}

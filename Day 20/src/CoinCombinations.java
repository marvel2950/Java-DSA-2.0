public class CoinCombinations {
    public static void main(String args[]) {
        int[] coin = {1, 2, 4};
        int amount = 6;
        combination(coin, amount, 0, "", 0);
    }

    private static void combination(int[] coin, int amount, int total, String ans, int idx) {
        if (amount == total) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount - total >= coin[i]) {
                combination(coin, amount, total + coin[i], ans + coin[i], i);
            }
        }
    }

}


public class CoinPermutations {
    public static void main(String args[]) {
        int[] coin = {1, 2, 4};
        int amount = 6;
        permutation(coin, amount, 0, "");
    }

    private static void permutation(int[] coin, int amount, int total, String ans) {
        if (amount == total) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount - total >= coin[i]) {
                permutation(coin, amount, total + coin[i], ans + coin[i]);
            }
        }
    }

}


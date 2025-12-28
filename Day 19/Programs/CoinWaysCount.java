public class CoinWaysCount {
    public static void main(String args[]) {
        int ip = 3;
        String op = "";
        int count = ways(ip, op);
        System.out.println(count);
    }

    private static int ways(int ip, String op) {
        if (ip == 0) {
            return 1;
        }
        int count1 = ways(ip - 1, op + "H");
        int count2 = ways(ip - 1, op + "T");
        return count1 + count2;
    }

}

public class CoinWays {
    public static void main(String args[]) {
        int ip = 3;
        String op = "";
        ways(ip, op);
    }

    private static void ways(int ip, String op) {
        if (ip == 0) {
            System.out.println(op);
            return;
        }
        ways(ip - 1, op + "H");
        ways(ip - 1, op + "T");
    }

}

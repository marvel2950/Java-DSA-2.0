public class LetterCombination {
    public static void main(String args[]) {
        String ip = "23";
        String op = "";
        solve(ip, op);
    }

    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }
        String ch = ip.charAt(0) + "";
        String pressedKey = keys[Integer.valueOf(ch)];
        for (int i = 0; i < pressedKey.length(); i++) {
//            System.out.println(pressedKey.charAt(i));
            solve(ip.substring(1), op + pressedKey.charAt(i));
        }
    }

}

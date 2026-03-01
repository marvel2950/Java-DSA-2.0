import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        String ip = digits;
        String op = "";
        List<String> list = new ArrayList<>();
        solve(ip, op, list);
        return list;
    }

    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    private static void solve(String ip, String op, List<String> list) {
        if (ip.length() == 0) {
            list.add(op);
            return;
        }
        String ch = ip.charAt(0) + "";
        String pressedKey = keys[Integer.valueOf(ch)];
        for (int i = 0; i < pressedKey.length(); i++) {
//            System.out.println(pressedKey.charAt(i));
            solve(ip.substring(1), op + pressedKey.charAt(i), list);
        }
    }
}
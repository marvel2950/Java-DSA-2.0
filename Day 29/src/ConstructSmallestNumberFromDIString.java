import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String args[]) {
        String str = "DDIDDI";
        System.out.println(str);
        System.out.println(constructSmallestNumber(str));
    }

    private static String constructSmallestNumber(String str) {
        int n = str.length();
        int[] ans = new int[n + 1];
        Stack<Integer> st = new Stack<>();
        int c = 1;
        for (int i = 0; i < n + 1; i++) {
            if (i == n || str.charAt(i) == 'I') {
                ans[i] = c;
                c++;
                while (!st.isEmpty()) {
                    int indD = st.pop();
                    ans[indD] = c;
                    c++;
                }
            } else {
                st.push(i);
            }
        }
        String s = "";
        for (int i = 0; i < ans.length; i++) {
            s = s + ans[i] + "";
        }
        return s;
    }
}

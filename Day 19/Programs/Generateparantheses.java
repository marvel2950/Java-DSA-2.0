class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int closed = 0;
        String ans = "";
        List<String> ll = new ArrayList<>();
        parenthesis(n, open, closed, ans, ll);
        return ll;
    }

    static void parenthesis(int n , int open, int closed, String ans, List<String> ll) {
        if(open == n && closed == n) {
            // System.out.println(ans);
            ll.add(ans);
            return;
        }
        if(open > n || closed > open) {
            return;
        }
        parenthesis(n, open+1, closed, ans+"(", ll);
        parenthesis(n, open, closed+1, ans+")", ll);
    }
}
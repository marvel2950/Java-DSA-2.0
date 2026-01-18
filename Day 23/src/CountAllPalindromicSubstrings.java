public class CountAllPalindromicSubstrings {
    public static void main(String args[]) {
        String s = "nitin";
        int count = countAllPalindromicSubstrings(s);
        System.out.println(count);
    }

    private static int countAllPalindromicSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (isPalindrome((sub))) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String x) {
        int i = 0;
        int j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

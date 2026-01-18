class Solution {
    public int countSubstrings(String s) {
        return countAllPalindromicSubstrings(s);
    }

    private static int countAllPalindromicSubstrings(String s) {
        return countAllPalindromicSubstringsEvenLength(s) + countAllPalindromicSubstringsOddLength(s);
    }

    private static int countAllPalindromicSubstringsOddLength(String s) {
        int odd = 0;
        // odd-length palindromic substrings
        for (int axis = 0; axis < s.length(); axis++) {
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt(axis - orbit) != s.charAt(axis + orbit)) {
                    break; // axis change
                }
                odd++;
            }
        }
        return odd;
    }

    private static int countAllPalindromicSubstringsEvenLength(String s) {
        int even = 0;
        // even-length palindromic substrings
        for (double axis = 0.5; axis < s.length(); axis++) {
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < s.length(); orbit++) {
                if (s.charAt((int) (axis - orbit)) != s.charAt((int) (axis + orbit))) {
                    break; // axis change
                }
                even++;
            }
        }
        return even;
    }
}
public class StringsAreEqual {
    public static void main(String args[]) {
        String s1 = "Akarsh"; // user-input
        String s2 = "Akarsh"; // user-input

        String s3 = "Akarsh"; // user-input
        String s4 = "Akansksha"; // user-input

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

        System.out.println(equals(s1, s2));
        System.out.println(equals(s3, s4));
    }

    public static boolean equals(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}

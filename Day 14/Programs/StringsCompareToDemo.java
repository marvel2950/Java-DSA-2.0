public class StringsCompareToDemo {
    public static void main(String args[]) {
        String s1 = "Akarsh";
        String s2 = "Akarsh";
        System.out.println(s1.compareTo(s2));
        System.out.println(compareTo(s1, s2));

        String s3 = "shinchan";
        String s4 = "sheero";
        System.out.println(s3.compareTo(s4));
        System.out.println(compareTo(s3, s4));

        String s5 = "ankitaaaahhhh";
        String s6 = "ankit";
        System.out.println(s5.compareTo(s6));
        System.out.println(compareTo(s5, s6));

        String s7 = "ankitf";
        String s8 = "ankita";
        System.out.println(s7.compareTo(s8));
        System.out.println(compareTo(s7, s8));
    }

    public static int compareTo(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }

        int n = Math.min(s1.length(), s2.length());
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }

}

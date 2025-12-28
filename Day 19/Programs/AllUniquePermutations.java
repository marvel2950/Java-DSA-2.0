public class AllUniquePermutations {
    public static void main(String args[]) {
        String ip = "aba";
        String op = "";
        printPerm(ip, op);
    }

    static boolean isPresent(String str, char ch, int i) {
        for(int j=0; j < i; j++) {
            if(str.charAt(j) == ch) {
                return false;
            }
        }
        return true;
    }

    private static void printPerm(String ip, String op) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }
        for (int i = 0; i < ip.length(); i++) {
            char ch = ip.charAt(i);
            if(isPresent(ip, ch, i)) {
                String s1 = ip.substring(0, i);
                String s2 = ip.substring(i + 1);
                printPerm(s1 + s2, op + ch);
            }
        }
    }

}

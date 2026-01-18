public class AllSubstringsIndex {
    public static void main(String args[]) {
        String s = "nitin";
        printAllIndex(s);
    }

    private static void printAllIndex(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
    }
}

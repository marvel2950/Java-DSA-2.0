public class PrintAllSubstringsLengthWise {
    public static void main(String... args) {
        String name = "akarsh";
        for (int len = 1; len <= name.length(); len++) {
            for (int j = len; j <= name.length(); j++) {
                int i = j - len;
                System.out.print(name.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}

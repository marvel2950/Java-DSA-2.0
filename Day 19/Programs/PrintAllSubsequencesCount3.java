public class PrintAllSubsequencesCount3 {
    public static void main(String args[]) {

        String ip = "abc";
        String op = "";
        int count = subsequence(ip, op);
        System.out.println(count);
    }

    private static int subsequence(String ip, String op) {
        if (ip.length() == 0) {
            return 1;
        }
        int count1 = subsequence(ip.substring(1), op + ip.charAt(0)); // include
        int count2 = subsequence(ip.substring(1), op); // don't include
        return count1 + count2;
    }

}

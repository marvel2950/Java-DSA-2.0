public class PrintAllSubsequencesCount2 {
    public static void main(String args[]) {

        String ip = "abc";
        String op = "";
        int count = 0;
        subsequence(ip, op, count);
        System.out.println(count);
    }

    private static void subsequence(String ip, String op, int count) {
        if(ip.length() == 0) {
            count++;
            return;
        }
        subsequence(ip.substring(1), op + ip.charAt(0), count); // include
        subsequence(ip.substring(1), op, count); // don't include
    }

}

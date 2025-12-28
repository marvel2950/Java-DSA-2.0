public class PrintAllSubsequencesCount {
    public static void main(String args[]) {

        String ip = "abc";
        String op = "";
        subsequence(ip, op);
        System.out.println(count);
    }

    static int count = 0;
    private static void subsequence(String ip, String op) {
        if(ip.length() == 0) {
            count++;
//            System.out.println(op);
            return;
        }
        subsequence(ip.substring(1), op + ip.charAt(0)); // include
        subsequence(ip.substring(1), op); // don't include
    }

}

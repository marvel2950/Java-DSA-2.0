public class StringPartitions {
    public static void main(String args[]) {
        String ip = "nitin";
        String op = "";
        partitionStr(ip, op);
    }

    private static void partitionStr(String ip, String op) {
        if(ip.length() == 0) {
            System.out.println(op);
            return;
        }
        for (int cut = 1; cut <= ip.length(); cut++) {
            String prefix = ip.substring(0, cut); // left
            String rest = ip.substring(cut); // right
            partitionStr(rest, op + prefix + "|");
        }
    }
}

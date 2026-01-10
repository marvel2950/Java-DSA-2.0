import java.util.ArrayList;
import java.util.List;

public class StringPartitionsPlaindrome {
    public static void main(String args[]) {
        String ip = "nitin";
        List<String> op = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitionStr(ip, op, ans);
        System.out.println(ans);
    }

    private static void partitionStr(String ip, List<String> op, List<List<String>> ans) {
        if (ip.length() == 0) {
            ans.add(new ArrayList<>(op));
            return;
        }
        for (int cut = 1; cut <= ip.length(); cut++) {
            String prefix = ip.substring(0, cut); // left
            if(isPalindrome(prefix)) {
                String rest = ip.substring(cut); // right
                op.add(prefix);
                partitionStr(rest, op, ans);
                op.remove(op.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

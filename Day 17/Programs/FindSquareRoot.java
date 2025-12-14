import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long low = 1;
        long high = n;

        long ans = -1;
        while(low <= high) {
            long mid = low + (high - low)/2;
            if(mid*mid == n) {
                ans = mid;
                break;
            } else if(mid*mid <= n) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }


}

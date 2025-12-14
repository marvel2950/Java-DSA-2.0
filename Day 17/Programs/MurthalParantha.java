import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        int c = sc.nextInt();
        int[] ranks = new int[c];
        for(int i=0; i<c; i++) {
            ranks[i] = sc.nextInt();
        }
        for(int i=1; ; i++) {
            if(canCook(p, c, ranks, i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean canCook(int p, int c, int[] ranks, int time) {
        for(int rank: ranks) {
            int timeTemp = time;
            int count = 0;
            int i = 1;
            while(true) {
                timeTemp = timeTemp - rank * i;
                i++;
                if(timeTemp >= 0) {
                    count++;
                } else {
                    break;
                }
            }
            // System.out.print(count + " ");
            p = p - count;
        }
        // System.out.println();
        return p <= 0;
    }
}

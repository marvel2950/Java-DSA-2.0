import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            solve(m, n);
            t--;
        }
    }

    public static void solve(int m, int n) {
        int phone = 1;
        int a = 0;
        int h = 0;

        while(true) {
            a = a + phone;
            if(a > m) {
                System.out.println("Harshit");
                break;
            }
            phone++;

            h = h + phone;
            if(h > n) {
                System.out.println("Aayush");
                break;
            }
            phone++;
        }
    }

}

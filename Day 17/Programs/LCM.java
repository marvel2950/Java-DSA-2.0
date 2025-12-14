import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int i = 1;

        while(true) {
            if(i%n1 == 0 && i%n2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
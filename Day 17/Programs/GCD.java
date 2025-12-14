import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int dividend;
        int divisor;

        if(n1 > n2) {
            dividend = n1;
            divisor = n2;
        } else {
            dividend = n2;
            divisor = n1;
        }

        while(dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }

}

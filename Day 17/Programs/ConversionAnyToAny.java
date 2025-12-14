import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int src = sc.nextInt();
        int des = sc.nextInt();
        int n = sc.nextInt();

        // Step 1: convert to decimal
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int rem = n % 10;
            decimal += rem * power;
            power *= src;
            n /= 10;
        }

        // Step 2: convert decimal to destination base
        int result = 0;
        power = 1;

        while (decimal > 0) {
            int rem = decimal % des;
            result += rem * power;
            power *= 10;
            decimal /= des;
        }

        System.out.println(result); // 11
    }

}

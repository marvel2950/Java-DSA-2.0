import java.util.Scanner;

public class Pattern0Input {
    public static void main(String[] args) {
        int i = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i < n){
            System.out.print("* ");
            i++;
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int j = 0;
        while(j < n){
            int i = 0;
            while(i < n){
                System.out.print("* ");
                i++;
            }
            
            System.out.println();
            j++;
        }

        sc.close();
    }
}

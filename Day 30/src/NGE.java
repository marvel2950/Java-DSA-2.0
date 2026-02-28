import java.util.Arrays;
import java.util.Scanner;

public class NGE {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] ans = new int[n];
        Arrays.fill(ans, -1); // initialize array with -1

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);
        display(ans);

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        display(ans);
    }

    public static void display(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

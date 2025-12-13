import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] ans = sumOfTwoArrays(arr1, arr2);

        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + ", ");
        }
        System.out.println("END");
    }

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        int carry = 0;

        while(i>=0 && j>=0) {
            int sum = arr1[i] + arr2[j] + carry;
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            list.add(sum);

            i--;
            j--;
        }

        while(i>=0) {
            int sum = arr1[i] + carry;
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            list.add(sum);

            i--;
        }

        while(j>=0) {
            int sum = arr2[j] + carry;
            if(sum > 9) {
                carry = 1;
                sum = sum % 10;
            } else {
                carry = 0;
            }
            list.add(sum);

            j--;
        }

        if(carry > 0) {
            list.add(carry);
        }

        int[] ans = new int[list.size()];

        int l = 0;
        for(j = list.size() -1; j >= 0; j--) {
            ans[l] = list.get(j);
            l++;
        }

        return ans;
    }
}
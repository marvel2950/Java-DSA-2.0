import java.util.Scanner;
import java.util.Stack;

public class NGELStackIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = ngel(arr);
        display(ans);
    }

    public static int[] ngel(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                ans[i] = -1;
            } else if (st.peek() > arr[i]) {
                ans[i] = st.peek();
            } else {
                while (!st.isEmpty() && arr[st.peek()] <= arr[i]) { // st.peek() <= arr[i]
                    st.pop();
                }

                if (st.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = st.peek();
                }
            }
            st.push(i); // st.push(arr[i]);
        }
        return ans;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

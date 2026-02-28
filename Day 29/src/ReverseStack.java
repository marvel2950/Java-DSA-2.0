import java.util.Stack;

public class ReverseStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();

        // add
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
//        st.push(14);
//        st.push(15);
//        st.push(16);

        System.out.println(st);

        reverseStack(st);

        System.out.println(st);
    }

    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        int x = st.pop();
        reverseStack(st);
        addAtLast(st, x);
    }

    private static void addAtLast(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int x = st.pop();
        addAtLast(st, ele);
        st.push(x);
    }
}

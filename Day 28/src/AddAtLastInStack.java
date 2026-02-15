import java.util.Stack;

public class AddAtLastInStack {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();

        // add
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);

        System.out.println(st);

        int ele = 18;
        addAtLast(st, ele);

        System.out.println(st);
    }

    private static void addAtLast(Stack<Integer> st, int ele) {
        if(st.isEmpty()) {
            st.push(ele);
            return;
        }
        int x = st.pop();
        addAtLast(st, ele);
        st.push(x);
    }
}

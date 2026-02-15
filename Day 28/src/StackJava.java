import java.util.Stack;

public class StackJava {

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
        System.out.println(st.size());
        System.out.println(st.capacity());

        // view or get
        System.out.println(st.peek());

        // remove
        st.pop();
        st.pop();
        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());

        for(Integer i : st) {
            System.out.println(i);
        }


    }
}

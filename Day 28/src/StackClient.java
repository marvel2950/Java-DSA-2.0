public class StackClient {

    public static void main(String args[]) throws Exception {
        StackImpl st = new StackImpl();

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

    }
}

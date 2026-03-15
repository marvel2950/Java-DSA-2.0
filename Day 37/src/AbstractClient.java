public class AbstractClient {
    public static void main(String args[]) {
//        AbstractClass ac = new AbstractClass();
        AbstractClassChild acc = new AbstractClassChild();
        acc.fun();
        acc.get();

        AbstractClass ac = new AbstractClass() {
            @Override
            public void fun() {
                System.out.println(" anonymous fun()");
            }
        };

        ac.fun();
        ac.get();

    }
}

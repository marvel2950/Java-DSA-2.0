public class MultiClass  implements  InterfaceA, InterfaceB{

    @Override
    public void funA() {
        System.out.println("funA() in MultiCLass");
    }

    public static void main(String args[]) {
        MultiClass mc = new MultiClass();

        mc.funA();
    }
}

public class ImplementerClient {
    public static void main(String args[]) {
        Implementer imp = new Implementer();

        imp.funA();
        imp.funB("akarsh");
        imp.funD();

        SampleInterface.funC();

        Implementer.funC();
    }
}

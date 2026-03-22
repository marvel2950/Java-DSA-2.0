public interface InterfaceA {
    default void funB() {
        privateFunA();
        System.out.println("funA() in InterfaceA");
    }

    private void privateFunA() {
        System.out.println("privateFunA() in InterfaceA");
    }
}

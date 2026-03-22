public interface SampleInterface {

    static int CONSTANT_VALUE = 100;

    void funA();
    int funB(String input);

    // InterfaceName.functionName()
    static void funC() {
        System.out.println("static method funC() in SampleInterface");
    }

    default void funD() {
        System.out.println("default method funD() in SampleInterface");
        System.out.println(CONSTANT_VALUE);
//        CONSTANT_VALUE = 55;
    }
}

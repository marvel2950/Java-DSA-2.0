import java.util.Collections;

public class Implementer implements SampleInterface {
    @Override
    public void funA() {
        System.out.println("funA() implementation");
    }

    @Override
    public int funB(String input) {
        System.out.println("funB() implementation");
        System.out.println(SampleInterface.CONSTANT_VALUE);
        return input.length();
    }

    static void funC() {
        System.out.println("method funC() in Implementer");
    }

    @Override
    public void funD() {
        System.out.println("default method funD() in Implementer");
    }


}

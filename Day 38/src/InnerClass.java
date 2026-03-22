public class InnerClass implements  OuterClass.NestedInterface {

    @Override
    public void nestedMethod() {
        System.out.println("nestedMethod() in InnerClass");
    }
}

public class MyClient {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.hashCode());
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
    }
}

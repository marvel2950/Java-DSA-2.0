public class Person2 {
    String name = "Random";
    int age = 91;

    public Person2() {

    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("static block");
    }
}

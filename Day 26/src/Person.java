public class Person {
    String name;
    int age;

    // default constructor
    public Person() {
        System.out.println("Constructor");
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("static block");
    }
}

public class PersonClient {
    public static void main(String args[]) {
        Person p = new Person();
        p.age = 25;
        p.name = "Akarsh";

        p.age = 26;

        Person p1 = new Person("Akarsh");
        System.out.println(p1.name);
        System.out.println(p1.age);

        Person p2 = new Person(27);
        System.out.println(p2.name);
        System.out.println(p2.age);

        Person p3 = new Person("Akarsh", 27);
        System.out.println(p3.name);
        System.out.println(p3.age);
    }
}

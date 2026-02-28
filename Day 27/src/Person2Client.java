public class Person2Client {
    public static void main(String args[]) {
        Person2 p = new Person2();
        p.age = 25;
        p.name = "Akarsh";
//
//        p.age = 26;

//        System.out.println(p.name);
//        System.out.println(p.age);

        Person2 p1 = new Person2("Akarsh", 15);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}

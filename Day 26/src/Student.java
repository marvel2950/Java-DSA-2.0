public class Student {
    String name;
    int age;

    public void introYourSelf() {
        System.out.println("My name is " + name
                + " and my age is " + age);
    }

    public void sayHey(String name) {
        System.out.println(this);
        System.out.println(this.name + " says Hey "
                + name);
    }

    public static void mentorName(Student s) {
//        introYourSelf(); // error
        System.out.println("Akarsh is mentor of "
                + s.name);
    }

    static {
        System.out.println("I am in Student Class Static Block 1");
    }

    static {
        System.out.println("I am in Student Class Static Block 2");
    }

    static {
        System.out.println("I am in Student Class Static Block 3");
    }
}


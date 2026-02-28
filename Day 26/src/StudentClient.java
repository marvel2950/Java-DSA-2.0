public class StudentClient {
    public static void main(String args[]) {

        Student s = new Student();
        s.name = "Aishwarya";
        s.age = 25;
//        System.out.println("s " + s);

        Student s1 = new Student();
        s1.name = "Abhi";
        s1.age = 27;
//        System.out.println("s1 " + s1);

//        s.introYourSelf();
//        s.sayHey("Vineet");

//        s1.sayHey("Abhishek");

        Student.mentorName(s);
        Student.mentorName(s1);
    }

    static {
        System.out.println("I am in Student Client Class Static Block");
    }
}


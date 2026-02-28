public class StudentClient {
    public static void main(String args[]) {
        Student s = new Student("Akarsh", 21, 90);
        System.out.println(s);

        System.out.println(s.getMarks());
        s.setMarks(99);
        System.out.println(s.getMarks());

        try {
            s.setAge(-91);
        } catch (Exception exc) {
            System.out.println(exc);
        } finally {
            System.out.println("All done");
        }

        System.out.println(s.getAge());

    }
}


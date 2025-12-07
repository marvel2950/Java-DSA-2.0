import java.util.Stack;

public class StringDemo {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);

        int[] arr = new int[8];
        System.out.println(arr.length); // variable -> attribute
        System.out.println(s1.length()); // method -> behaviour

        String fName = "Akarsh";
        String lName = "Jaiswal";

        String fullName = fName + " " + lName + " Noida";
        System.out.println(fullName);

        String s = "My     name is Akarsh";
        String[] brr = s.split(" +");

        for(String str: brr) {
            System.out.println(str);
        }

        String demo = "Akarsh    ";
        System.out.println(demo);

        demo = demo.trim();
        System.out.println(demo);

    }
}

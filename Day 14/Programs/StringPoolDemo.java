public class StringPoolDemo {
    public static void main(String args[]) {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        s1 = s1 + "bye";
        s2 = s2 + s3;
        s3 = s3+s4;

        s2 = s2.concat("okay");

        String s5 = "hello" + "bye";

        String h1 = "hello";

        String h2 = h1 + new String(" bye");
        String h3 = h1 + new String(" bye");
        System.out.println(h2 == h3);
    }
}

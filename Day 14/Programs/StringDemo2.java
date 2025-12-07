public class StringDemo2 {
    public static void main(String args[]) {
        System.out.println("Hey" + 10 + 20 + "Bye");
        System.out.println("Hey" + (10 + 20) + "Bye");
        System.out.println(10 + 20 + "Hey" + "Bye");

        String s = "akarsh";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(s.length() - 1));
//        System.out.println(s.charAt(6)); // StringIndexOutOfBoundsException

    }
}

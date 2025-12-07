public class SubstringDemo {
    public static void main(String args[]) {
        String s = "Akarsh";

        String part1 = s.substring(1);
        System.out.println(part1);

        String part2 = s.substring(1, 4);
        System.out.println(part2);

        String part3 = s.substring(s.length() - 3);
        System.out.println(part3);

//        String part4 = s.substring(0, 10);
//        System.out.println(part4);

    }


}

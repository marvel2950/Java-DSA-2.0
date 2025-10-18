public class LogicalOperators {
    public static void main(String[] args) {

        int x = 4;
        System.out.println(x < 5 && x < 11 && x < 100);

        x = 11;
        System.out.println(x < 5 || x < 11);

        System.out.println(!(x < 5));
    }

}

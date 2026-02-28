public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello Akarsh");
        int a = 5;
        try {
//            a = a/0;
            int[] arr = {22, 3};
            a =  arr[4];
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("catch 1 block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("catch 2 block");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("catch 3 block");
        }

        System.out.println("Bye Akarsh");
        System.out.println("Bye Akarsh");
        System.out.println("Bye Akarsh");
        System.out.println("Bye Akarsh");
        System.out.println("Bye Akarsh");

    }
}

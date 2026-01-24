import java.util.Random;

public class RandomDemo {
    public static void main(String args[]) {
        int low = 10;
        int high = 100;

        Random rn = new Random();

        System.out.println("y | x");
        System.out.println("------");

        for(int i=0 ;i<10; i++){
//            System.out.println(rn.nextInt(high)); // 0 to 100
//            System.out.println(rn.nextInt(high - low + 1)); // 0 to 90
            System.out.println(rn.nextInt(high - low + 1) + low); // 10 to 100
        }
    }
}

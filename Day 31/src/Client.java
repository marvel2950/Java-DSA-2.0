import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        // Case-1
//        P obj = new P();
//        System.out.println(obj.d);
//        System.out.println(obj.d1);
//        obj.fun();
//        obj.fun1();

        // Case-2
//        P obj = new C();
////        List<Integer> list = new ArrayList<>();
//
//        System.out.println(obj.d);
//        System.out.println(((C)obj).d);
//        System.out.println(obj.d1);
////        System.out.println(obj.d2);
//        System.out.println(((C)obj).d2);
//        obj.fun();
//        obj.fun1();
//        ((C) obj).fun2();

        // Case-3
//        C obj = new P();

        // Case-4
        C obj = new C();
        System.out.println(obj.d);
        System.out.println(obj.d1);
        System.out.println(obj.d2);
        obj.fun();
        obj.fun1();
        obj.fun2();






    }
}

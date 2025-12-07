public class WrapperClassesDemo {
    public static void main(String args[]) {
        int a = 10;
        Integer a1 = 10; //auto-boxing

        System.out.println(a);
        System.out.println(a1);

        Long l = 89l;
        long ll = 7890;

//        l = ll; // auto-boxing

        a1 = a; //auto-boxing
        ll = l; //unboxing

        Integer c1 = 102;
        Integer c2 = 102;
        Integer c3 = 722;
        Integer c4 = 722;

        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
        System.out.println(c3.equals(c4));

        Integer c5 = new Integer(5);
        Integer c6 = new Integer(5);
        System.out.println(c5 == c6);

        Character ch1 = 'a';
        Character ch2 = 'a';
        System.out.println(ch1 == ch2); 

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2); 

        Double d1 = 189.7;
        Double d2 = 189.7;
        System.out.println(d1 == d2);  

        System.out.println(a == a1);  

        Integer aa = 100;
        Integer b = 100;
        System.out.println(aa == b); 

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d); 

        Long e = 127L;
        Long f = 127L;
        System.out.println(e == f); 

        Long g = 128L;
        Long h = 128L;
        System.out.println(g == h); 

        Character ch3 = 65;
        Character ch4 = 65;
        System.out.println(ch3 == ch4); 

        Character ch5 = 200;
        Character ch6 = 200;
        System.out.println(ch5 == ch6); 

        Boolean bool1 = true;
        Boolean bool2 = true;
        System.out.println(bool1 == bool2); 

        Float fl1 = 10.5f;
        Float fl2 = 10.5f;
        System.out.println(fl1 == fl2); 

        Double d3 = 10.5;
        Double d4 = 10.5;
        System.out.println(d3 == d4); 

        System.out.println("Hello Akarsh!");
    }
}

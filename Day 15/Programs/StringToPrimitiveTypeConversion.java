public class StringToPrimitiveTypeConversion {
    public static void main(String args[]) {
        String str1 = "564567";
        int x = Integer.parseInt(str1);
        x++;
        System.out.println(x);

        String str2 = "564567";
        long l = Long.parseLong(str2);
        l++;
        System.out.println(l);

        String str3 = "56456.907";
        double d = Double.parseDouble(str3);
        d++;
        System.out.println(d);
    }
}

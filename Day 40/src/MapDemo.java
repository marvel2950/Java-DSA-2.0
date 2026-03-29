import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();

        System.out.println(map.put("Akarsh", 25));
        System.out.println(map.put("Ayushi", 56));
        map.put("Jasmine", 11);

        System.out.println(map);

        System.out.println(map.containsKey(78));
        System.out.println(map.containsKey(22));

        System.out.println(map.remove(22));
        System.out.println(map.containsKey(22));

        System.out.println(map);
        System.out.println();


        TreeMap<String, Integer> map1 = new TreeMap<>();

        System.out.println(map1.put("Akarsh", 25));
        System.out.println(map1.put("Ayushi", 56));
        map1.put("Jasmine", 11);

        System.out.println(map1);

        System.out.println(map1.containsKey("Abhay"));
        System.out.println(map1.containsKey("Jassi"));

        System.out.println(map1.remove("Ayushi"));
        System.out.println(map1.containsKey("Ayushi"));

        System.out.println(map1);
        System.out.println();


        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();

        System.out.println(map2.put("Akarsh", 25));
        System.out.println(map2.put("Ayushi", 56));
        map2.put("Jasmine", 11);

        System.out.println(map2);

        System.out.println(map2.containsKey(78));
        System.out.println(map2.containsKey(22));

        System.out.println(map2.remove(22));
        System.out.println(map2.containsKey(22));

        System.out.println(map2);
        System.out.println();

        for (String key : map.keySet()) {
            System.out.print(key + " -> " + map.get(key) + ", ");
        }
        System.out.println();

        for (String key : map1.keySet()) {
            System.out.print(key + " -> " + map.get(key) + ", ");
        }
        System.out.println();

        for (String key : map2.keySet()) {
            System.out.print(key + " -> " + map.get(key) + ", ");
        }
        System.out.println();

    }
}

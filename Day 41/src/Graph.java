import java.util.HashMap;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

//    map => key -> vertices, value -> innerMap
//    innerMap => key -> connected vertex, value -> weight of edge

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        HashMap<Integer, Integer> innerMap1 = map.get(v1); // 5k
        innerMap1.put(v2, cost);

        HashMap<Integer, Integer> innerMap2 = map.get(v2); // 7k
        innerMap2.put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
        if (containsVertex(v1)) {
            HashMap<Integer, Integer> innerMap = map.get(v1); // 5k
            return innerMap.containsKey(v2);
        }
        return false;
    }

    public boolean containsVertex(int v) {
        return map.containsKey(v);
    }

    public int noOfEdges() {
        int sum = 0;
        for (int v : map.keySet()) {
            HashMap<Integer, Integer> innerMap = map.get(v);
            sum = sum + innerMap.size();
        }
        return sum / 2;
    }
}



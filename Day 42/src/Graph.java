import java.util.HashMap;
import java.util.HashSet;

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

    public void removeEdge(int v1, int v2) {
        HashMap<Integer, Integer> innerMap1 = map.get(v1); // 5k
        innerMap1.remove(v2);

        HashMap<Integer, Integer> innerMap2 = map.get(v2); // 7k
        innerMap1.remove(v1);
    }

    public void removeVertex(int v) {
        for (int nbrs : map.get(v).keySet()) {
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }

    public void display() {
        for (int vtx : map.keySet()) {
            HashMap<Integer, Integer> innerMap = map.get(vtx);
            System.out.println(vtx + " --> " + innerMap);
        }
    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }

        visited.add(src);
        // call hasPath recursively for all nbrs of src only if not visited yet
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visited);
                if (ans) {
                    return true;
                }
            }

        }
        return false;
    }

    public void printPath(int src, int des, HashSet<Integer> visited, String path) {
        if (src == des) {
            path = path + des;
            System.out.println(path);
        }

        visited.add(src);
        // call hasPath recursively for all nbrs of src only if not visited yet
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printPath(nbrs, des, visited, path + src + " --> ");
            }
        }
        visited.remove(src);
    }
}



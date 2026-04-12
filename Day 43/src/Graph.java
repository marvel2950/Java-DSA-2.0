import java.util.*;

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

    public boolean bfs(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);

        while (!q.isEmpty()) {
            // 1. remove
            int r = q.poll(); // r -> removed node

            // 2. ignore if already visited
            if (visited.contains(r)) {
                continue;
            }

            // 3. mark visited
            visited.add(r);

            // 4. self work
            if (r == des) {
                return true;
            }

            // 5. add unvisited nbrs
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }

        }
        return false;
    }

    public boolean dfs(int src, int des) {
        Stack<Integer> st = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();
        st.add(src);

        while (!st.isEmpty()) {
            // 1. remove
            int r = st.pop(); // r -> removed node

            // 2. ignore if already visited
            if (visited.contains(r)) {
                continue;
            }

            // 3. mark visited
            visited.add(r);

            // 4. self work
            if (r == des) {
                return true;
            }

            // 5. add unvisited nbrs
            for (int nbrs : map.get(r).keySet()) {
                if (!visited.contains(nbrs)) {
                    st.add(nbrs);
                }
            }

        }
        return false;
    }
}



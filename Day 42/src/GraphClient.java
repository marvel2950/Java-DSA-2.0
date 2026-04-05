public class GraphClient {
    public static void main(String args[]) {
        Graph g = new Graph(7);
        g.addEdge(1, 2, 4);
        g.addEdge(1, 4, 7);
        g.addEdge(2, 3, 5);
        g.addEdge(3, 4, 1);
        g.addEdge(5, 4, 2);
        g.addEdge(5, 6, 7);
        g.addEdge(5, 7, 9);
        g.addEdge(6, 7, 11);

//        System.out.println(g.noOfEdges());
//
//        System.out.println(g.containsVertex(9));
//
//        System.out.println(g.containsEdge(1, 2));
//        g.removeEdge(1, 2);
//        System.out.println(g.containsEdge(1, 2));
//        System.out.println(g.containsEdge(6, 1));
//
//        System.out.println(g.containsVertex(1));
//        g.removeVertex(1);
//        System.out.println(g.containsVertex(1));
//
//        g.display();

        System.out.println(g.hasPath(1, 7));


    }
}

public class Main {

    public static void main(String[] args) {



        Graph g = new Graph(9, 15); // tu +1 do il. wezlow
        g.addEdge(new Edge(3, 5, 2));
        g.addEdge(new Edge(6, 7, 5));
        g.addEdge(new Edge(3, 4, 6));
        g.addEdge(new Edge(4, 8, 7));
        g.addEdge(new Edge(1, 2, 9));
        g.addEdge(new Edge(4, 5, 11));
        g.addEdge(new Edge(1, 6, 14));
        g.addEdge(new Edge(1, 7, 15));
        g.addEdge(new Edge(5, 8, 16));
        g.addEdge(new Edge(3, 6, 18));
        g.addEdge(new Edge(3, 8, 19));
        g.addEdge(new Edge(7, 5, 20));
        g.addEdge(new Edge(2, 3, 24));
        g.addEdge(new Edge(7, 8, 44));
        g.addEdge(new Edge(6, 5, 30));
        g.kruskal();
    }
}
public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(4, 5);
        g.addEdge(new Edge(0, 1, 10));
        g.addEdge(new Edge(0, 2, 6));
        g.addEdge(new Edge(0, 3, 5));
        g.addEdge(new Edge(1, 3, 15));
        g.addEdge(new Edge(2, 3, 4));
        g.kruskal();
    }
}
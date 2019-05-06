public class Edge {
    int s;
    int d;
    int w;

    public Edge(int s, int d, int w) {
        this.s = s;
        this.d = d;
        this.w = w;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "s=" + s +
                ", d=" + d +
                ", w=" + w +
                '}';
    }
}

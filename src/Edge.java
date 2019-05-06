public class Edge {
    int s;
    int d;
    int w;

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public Edge(int s, int d, int w) {
        this.s = s;
        this.d = d;
        this.w = w;
    }

    @Override
    public String toString() {
        return this.s + " " + this.d + " " + this. w;
    }
}

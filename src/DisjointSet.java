import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<Node> sets = new ArrayList<>();

    public Node make() {
        Node node = new Node();
//        node.key = key;
        node.root = node;
        node.rank = 0;
        sets.add(node);
        return node;
    }

    public Node find(Node node) {
        if(node != node.root) {
            node.root = find(node.root);
        }
        return node.root;
    }

    public void union(Node node1, Node node2) {
        if(node1.rank > node2.rank) {
            node2.root = node1;
        } else {
            node1.root = node2;
            if(node1.rank == node2.rank) {
                node2.rank = node2.rank + 1;
            }
        }
    }
}
package tree;

public class Node {
    int data;
    int start;
    int end;
    Node left;
    Node right;

    public Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

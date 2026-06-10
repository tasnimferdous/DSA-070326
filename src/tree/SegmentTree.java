package tree;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        Node root = constructTree(arr, 0, arr.length-1);
        prettyDisplay(root, 0);
    }

    private static Node constructTree(int[] arr, int strat, int end) {
        if (strat == end) {
            Node leafNode = new Node(strat, end);
            leafNode.data = arr[strat];
            return leafNode;
        }

        Node newNode = new Node(strat, end);
        int mid = strat + (end-strat) / 2;
        newNode.left = constructTree(arr, strat, mid);
        newNode.right = constructTree(arr, mid+1, end);
        newNode.data = newNode.left.data + newNode.right.data;
        return newNode;
    }

    private static void prettyDisplay(Node root, int level) {
        if (root == null) return;
        prettyDisplay(root.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        if (level == 0) {
            System.out.println(root.data);
        } else {
            System.out.println("|---> " + root.data);
        }

        prettyDisplay(root.left, level + 1);
    }
}

package tree;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(nums);
        tree.display();

        AvlTree avlTree = new AvlTree();
        for (int i = 0; i < 10; i++) {
            avlTree.insert(i);
        }
        System.out.println("Height of AVL Tree: " + avlTree.height());

    }
}

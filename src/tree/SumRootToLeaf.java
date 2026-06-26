package tree;

public class SumRootToLeaf {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(sumNumbers(root));
    }

    static int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }

    private static int sumNumbersHelper(TreeNode root, int total) {
        if (root == null) return 0;
        total = total * 10 + root.value;
        if (root.left == null && root.right == null) return total;
        return sumNumbersHelper(root.left, total) + sumNumbersHelper(root.right, total);
    }
}

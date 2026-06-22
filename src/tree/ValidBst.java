package tree;

public class ValidBst {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(isValidBST(root));
    }

    static boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    static boolean isValid(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.value <= min.value) {
            return false;
        }

        if (max != null && root.value >= max.value) {
            return false;
        }

        boolean left = isValid(root.left, min, root);
        boolean right = isValid(root.right, root, max);

        return left && right;
    }
}

package tree;

public class Diameter {
    static int diameter = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int result = diameterOfBinaryTree(root);
        System.out.println(result);
    }

    static int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter;
    }

    private static int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int len = leftHeight + rightHeight;
        diameter = Math.max(diameter, len) + 1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

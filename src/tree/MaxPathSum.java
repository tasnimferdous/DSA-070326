package tree;

public class MaxPathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
//        root.right.right.right = new TreeNode(8);

        System.out.println(maxPathSum(root));
    }

    static int maxSum = Integer.MIN_VALUE;

    static int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }

    private static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));

        int sum = left + right + root.value;
        maxSum = Math.max(maxSum, sum);

        return Math.max(left, right) + root.value;
    }
}

package tree;

public class KthSmallestInBst {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        System.out.println(kthSmallest(root, 6));
    }

    static int count = 0;
    static int kthSmallest(TreeNode root, int k) {
        if (root == null) return -1;

        int left = kthSmallest(root.left, k);
        if(left != -1) return left;

        count++;
        if(count == k) return root.value;

        return kthSmallest(root.right, k);
    }
}

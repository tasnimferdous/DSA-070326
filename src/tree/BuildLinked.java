package tree;

public class BuildLinked {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        connect(root);
    }

    static TreeNode connect(TreeNode root) {
        if(root == null ) return null;
        TreeNode levelFirst = root;

        while(levelFirst.left != null){
            TreeNode curr = levelFirst;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            levelFirst = levelFirst.left;
        }

        return root;
    }
}

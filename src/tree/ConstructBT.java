package tree;

import java.util.Arrays;

public class ConstructBT {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = buildTree(preorder, inorder);
    }

    static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == root.value){
                index = i;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return root;
    }
}

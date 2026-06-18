package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cousins {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        boolean result = isCousins(root, 5, 7);
        System.out.println(result);
    }

    static boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            boolean xFound = false;
            boolean yFound = false;
            TreeNode xParent = null;
            TreeNode yParent = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                    if(!xFound && node.left.value == x){
                        xFound = true;
                        xParent = node;
                    }
                    if(!yFound && node.left.value == y){
                        yFound = true;
                        yParent = node;
                    }
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    if(!xFound && node.right.value == x){
                        xFound = true;
                        xParent = node;
                    }
                    if(!yFound && node.right.value == y){
                        yFound = true;
                        yParent = node;
                    }
                }

                if(xFound && yFound){
                    return xParent != yParent;
                }
            }
        }
        return false;
    }
}

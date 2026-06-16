package tree;

import java.util.*;

public class ZigZagOrder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = levelOrder(root);
        System.out.println(result);
    }

    static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if(!reverse){
                    TreeNode node = queue.pollFirst();
                    list.add(node.value);
                    if (node.left != null) {
                        queue.offerLast(node.left);
                    }
                    if (node.right != null) {
                        queue.offerLast(node.right);
                    }
                }else{
                    TreeNode node = queue.pollLast();
                    list.add(node.value);
                    if (node.right != null) {
                        queue.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        queue.offerFirst(node.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(list);
        }
        return result;
    }
}

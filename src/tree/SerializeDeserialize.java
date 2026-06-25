package tree;

import java.util.ArrayList;
import java.util.List;

public class SerializeDeserialize {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        String s = serialize(root);
        System.out.println(s);
        deserialize(s);
    }

    static List<String> list = new ArrayList<String>();
    static String serialize(TreeNode root) {
        if(root == null){
            list.add("null");
            return "null";
        }

        list.add(String.valueOf(root.value));
        serialize(root.left);
        serialize(root.right);
        return String.join(",", list);
    }

    static TreeNode deserialize(String data) {
        if(list.isEmpty()){
            return null;
        }
        if(list.getFirst().equals("null")){
            list.removeFirst();
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(list.getFirst()));
        list.removeFirst();
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }
}

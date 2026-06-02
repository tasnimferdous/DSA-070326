package tree;

import java.util.Scanner;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        insertTreeNode(root);

        prettyDisplay(root, 0);
    }

    private static void prettyDisplay(TreeNode root, int level) {
        if (root == null) return;
        prettyDisplay(root.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        if (level == 0) {
            System.out.println(root.value);
        } else {
            System.out.println("|----" + root.value);
        }

        prettyDisplay(root.left, level + 1);
    }

    private static void insertTreeNode(TreeNode root) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to insert the left node of " + root.value);
        boolean left = input.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left node of " + root.value);
            int leftValue = input.nextInt();
            root.left = new TreeNode(leftValue);
            insertTreeNode(root.left);
        }

        System.out.println("Do you want to insert the right node of " + root.value);
        boolean right = input.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right node of " + root.value);
            int rightValue = input.nextInt();
            root.right = new TreeNode(rightValue);
            insertTreeNode(root.right);
        }
    }
}

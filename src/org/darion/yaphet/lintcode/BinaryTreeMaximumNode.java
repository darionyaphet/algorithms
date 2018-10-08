package org.darion.yaphet.lintcode;

public class BinaryTreeMaximumNode {

    public static TreeNode maxNode(TreeNode root) {
        if (root == null) {
            return null;
        }

//        System.out.println("Root " + root.left.val + " " + root.right.val);
        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);

//        System.out.println(left.val + "  " + right.val);
        if (left != null && root.val < left.val) {
            System.out.println("Left : " + left.val);
            root = left;
        }
        if (right != null && root.val < right.val) {
            System.out.println("Right : " + right.val);
            root = right;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(-5);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(-4);
        root.right.right = new TreeNode(-5);

        System.out.println(maxNode(root).val);
    }
}

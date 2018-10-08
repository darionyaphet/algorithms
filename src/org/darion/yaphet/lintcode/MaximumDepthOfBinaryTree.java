package org.darion.yaphet.lintcode;


public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        return left > right ? left + 1 : right + 1;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        return left > right ? left + 1 : right + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        MaximumDepthOfBinaryTree instance = new MaximumDepthOfBinaryTree();
        System.out.println(instance.maxDepth(root));
    }
}

package org.darion.yaphet.lintcode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        return left < right ? left : right;
    }

    private int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int left = depth(root.left) + 1;
        int right = depth(root.right) + 1;
        if (left == 1) {
            left = Integer.MAX_VALUE;
        }
        if (right == 1) {
            right = Integer.MAX_VALUE;
        }
        return left < right ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        MinimumDepthOfBinaryTree instance = new MinimumDepthOfBinaryTree();
        System.out.println(instance.minDepth(root));
    }
}

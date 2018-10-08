package org.darion.yaphet.lintcode;

public class IdenticalBinaryTree {
    public boolean isIdentical(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null) {
            return false;
        }
        if (b == null) {
            return false;
        }

        if (a.val == b.val) {
            boolean left, right;
            if ((a.left != null && b.left != null) || (a.left == null && b.left == null)) {
                left = isIdentical(a.left, b.left);
            } else {
                return false;
            }

            if ((a.right != null && b.right != null) || (a.right == null && b.right == null)) {
                right = isIdentical(a.right, b.right);
            } else {
                return false;
            }

            return left && right;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);

        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);

        IdenticalBinaryTree instance = new IdenticalBinaryTree();
        System.out.println(instance.isIdentical(a, b));
    }
}

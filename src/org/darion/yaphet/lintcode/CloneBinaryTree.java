package org.darion.yaphet.lintcode;

public class CloneBinaryTree {
    public TreeNode cloneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode cloneRoot = new TreeNode(root.val);
        cloneRoot.left = cloneTree(root.left);
        cloneRoot.right = cloneTree(root.right);

        return cloneRoot;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        CloneBinaryTree instance = new CloneBinaryTree();
        System.out.println(instance.cloneTree(root));
    }
}

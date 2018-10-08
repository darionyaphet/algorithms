package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);

        if (root.left != null) {
            result.addAll(preorderTraversal(root.left));
        }

        if (root.right != null) {
            result.addAll(preorderTraversal(root.right));
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
    }
}

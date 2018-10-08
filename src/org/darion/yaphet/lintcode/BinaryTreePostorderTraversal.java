package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        if (root.left != null) {
            result.addAll(postorderTraversal(root.left));
        }

        if (root.right != null) {
            result.addAll(postorderTraversal(root.right));
        }

        result.add(root.val);
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
    }
}

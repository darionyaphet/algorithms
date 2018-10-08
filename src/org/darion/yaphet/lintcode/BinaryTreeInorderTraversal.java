package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        if (root.left != null) {
            result.addAll(inorderTraversal(root.left));
        }

        result.add(root.val);

        if (root.right != null) {
            result.addAll(inorderTraversal(root.right));
        }
        return result;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}

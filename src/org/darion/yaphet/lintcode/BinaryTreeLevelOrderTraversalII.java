package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            Queue<TreeNode> level = new LinkedList<>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node);
                    list.add(node.val);
                }
            }

            if (list.size() != 0) {
                result.add(list);
            }

            while (!level.isEmpty()) {
                TreeNode current = level.poll();
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        List<List<Integer>> tmp = new LinkedList<>();
        for (int index = result.size() - 1; index >= 0; index--) {
            tmp.add(result.get(index));
        }
        return tmp;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversalII instance = new BinaryTreeLevelOrderTraversalII();
        System.out.println(instance.levelOrderBottom(root));
    }
}

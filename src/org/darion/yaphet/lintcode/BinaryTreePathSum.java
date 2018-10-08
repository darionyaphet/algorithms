package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePathSum {
//    public static List<List<Integer>> result = new LinkedList<>();
//
//    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
//        if (root == null) {
//            return new LinkedList<>();
//        }
//
//        treePathSum(root, target, new LinkedList<>());
//        return result;
//    }
//
//    private void treePathSum(TreeNode root, int remainder, List<Integer> list) {
//        remainder -= root.val;
//        list.add(root.val);
//
//        if (root.left == null && root.right == null && remainder == 0) {
//            List<Integer> l = new LinkedList<>();
//            for (int i = 0; i < list.size(); i++) {
//                l.add(list.get(i));
//            }
//            result.add(l);
//            return;
//        }
//
//        if (root == null || remainder == 0) {
//            list.remove(list.size() - 1);
//            return;
//        }
//
//        if (root.left != null) {
//            treePathSum(root.left, remainder, list);
//        }
//
//        list.remove(list.size() - 1);
//
//        if (root.right != null) {
//            treePathSum(root.right, remainder, list);
//        }
//    }

    private List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> binaryTreePathSum(TreeNode root, int k) {
        if (root == null) {
            new LinkedList<>();
        }

        Stack<Integer> stack = new Stack<>();
        binaryTreePathSum(root, k, stack);
        return result;
    }

    public void binaryTreePathSum(TreeNode root, int k, Stack<Integer> path) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            if (root.val == k) {
                List<Integer> list = new LinkedList<>();
                for (int i : path) {
                    list.add(i);
                }
                list.add(root.val);
                result.add(list);
            }
        } else {
            path.push(root.val);
            binaryTreePathSum(root.left, k - root.val, path);
            binaryTreePathSum(root.right, k - root.val, path);
            path.pop();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        BinaryTreePathSum instance = new BinaryTreePathSum();
        instance.binaryTreePathSum(root, 5);
        System.out.println(instance.result);
    }
}

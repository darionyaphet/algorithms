package org.darion.yaphet.lintcode;

import java.util.LinkedList;
import java.util.List;

public class ConvertBstToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        List<Integer> list = getValues(root);
//        System.out.println(list);

        addValue(root, list);
        return root;
    }

    private List<Integer> getValues(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null)
            return list;
        else
            list.add(root.val);
        list.addAll(getValues(root.left));
        list.addAll(getValues(root.right));
        return list;
    }

    private void addValue(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        int value = root.val;
        int sum = 0;
        for (Integer i : list) {
            if (i > value) {
                sum += i;
            }
        }

        addValue(root.left, list);
        addValue(root.right, list);
        root.val = value + sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        ConvertBstToGreaterTree instance = new ConvertBstToGreaterTree();
        root = instance.convertBST(root);
        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }
}

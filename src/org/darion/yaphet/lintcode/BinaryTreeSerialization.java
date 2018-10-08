package org.darion.yaphet.lintcode;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSerialization {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        StringBuffer buffer = new StringBuffer();

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                buffer.append(node.val + ",");
            } else {
                buffer.append("#,");
                continue;
            }
            queue.add(node.left);
            queue.add(node.right);
        }

        String value = buffer.toString();
        return value.substring(0, value.length() - 1);
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }

        String[] array = data.split(",");
        if (array == null || array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(array[0]));
        TreeNode current = root;

        for (int index = 1; index < array.length; ) {

            if (array[index].equals("#")) {
                current.left = null;
            } else {
                current.left = new TreeNode(Integer.valueOf(array[index]));
            }

            if (array[index++].equals("#")) {

            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(8);
        root.right.right = new TreeNode(15);

        BinaryTreeSerialization instance = new BinaryTreeSerialization();
        String string = instance.serialize(root);
        System.out.println(string);
//        TreeNode node = instance.deserialize(string);
//        System.out.println(node.val);
    }
}

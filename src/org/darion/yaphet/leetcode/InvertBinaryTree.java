package org.darion.yaphet.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
	public InvertBinaryTree() {

	}

	public TreeNode invertTree(TreeNode root) {
		TreeNode node = null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.add(root);
		}

		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node == null) {
				continue;
			}

			TreeNode left = node.left;
			TreeNode right = node.right;
			// System.out.println(left.val + " " + right.val);

			if (left != null) {
				node.right = left;
				queue.add(node.right);
			}
			if (right != null) {
				if (left.val != right.val) {
					node.left = right;
					queue.add(node.left);
				} else {
					node.left = null;
				}
			}
		}
		return root;
	}

//	public TreeNode invertTree(TreeNode root) {
//		if (root != null) {
//			TreeNode left = root.left;
//			root.left = root.right;
//			root.right = left;
//			invertTree(root.left);
//			invertTree(root.right);
//		}
//		return root;
//	}

	public static void main(String[] args) {
		// TreeNode root = new TreeNode(4);
		// root.left = new TreeNode(2);
		// root.left.left = new TreeNode(1);
		// root.left.right = new TreeNode(3);
		//
		// root.right = new TreeNode(7);
		// root.right.left = new TreeNode(6);
		// root.right.right = new TreeNode(9);

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);

		// System.out.println(root.val);
		// System.out.println(root.left.val + "  " + root.right.val);
		// System.out.println(root.left.left.val + "  " + root.left.right.val);
		// System.out.println(root.right.left.val + "  " +
		// root.right.right.val);

		InvertBinaryTree tree = new InvertBinaryTree();
		TreeNode InvertedRoot = tree.invertTree(root);
		// TreeNode InvertedRoot = tree.invertTree(null);

		System.out.println("============================");
		System.out.println(root.val);
		System.out.println(root.left.val + "  " + root.right.val);
		// System.out.println(root.left.left.val + "  " + root.left.right.val);
		// System.out.println(root.right.left.val + "  " +
		// root.right.right.val);
	}
}

package org.darion.yaphet.lintcode;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * http://www.lintcode.com/zh-cn/problem/binary-tree-level-order-traversal/
 * 
 * @author darion.yaphet
 *
 */
public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

		Queue<TreeNode> queue = new LinkedBlockingQueue<>();
		if (root != null) {
		}
		return null;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		BinaryTreeLevelOrderTraversal instance = new BinaryTreeLevelOrderTraversal();

	}
}

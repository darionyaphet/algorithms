package org.darion.leetcode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class SymmetricTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> queue = new LinkedBlockingQueue<SymmetricTree.TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {

		}
		return true;
	}

	public static void main(String[] args) {
		SymmetricTree tree = new SymmetricTree();
	}

}

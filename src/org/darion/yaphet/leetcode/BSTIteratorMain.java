package org.darion.yaphet.leetcode;

public class BSTIteratorMain {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		BSTIterator iterator = new BSTIterator(root);

		while (iterator.hasNext()) {
			int index = iterator.next();
		}
	}
}

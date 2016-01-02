package org.darion.yaphet.leetcode;

import java.util.LinkedList;
import java.util.List;

public class BSTIterator {

	private List<Integer> list = new LinkedList<Integer>();

	private void preOrderTraversal(TreeNode rootNode) {
		

	}

	public BSTIterator(TreeNode root) {
		preOrderTraversal(root);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return true;
	}

	/** @return the next smallest number */
	public int next() {
		return 0;
	}
}
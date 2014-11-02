package org.darion.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * For example, this binary tree is symmetric:
 * 
 * 
 * Note: Bonus points if you could solve it both recursively and iteratively.
 * 
 * @author darion
 */
public class SymmetricTree {

	// Definition for binary tree
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private Queue<TreeNode> treeQueue = new LinkedList<TreeNode>();

	public TreeNode loadFromString(String input) {
		if (input.startsWith("{"))
			input = input.substring(1);

		if (input.endsWith("}"))
			input = input.substring(0, input.length() - 1);

		String[] array = input.split(",");
		// System.out.println(input);
		// System.out.println(Arrays.toString(array));
		TreeNode root = new TreeNode(Integer.valueOf(array[0]));
		treeQueue.add(root);
		int index = 1;
		while (!treeQueue.isEmpty()) {
			TreeNode node = treeQueue.poll();
			String leftNodeString = array[index++];
			if (!"#".equals(leftNodeString)) {
				TreeNode left = new TreeNode(Integer.valueOf(leftNodeString));
				node.left = left;
				System.out.println("Add : " + leftNodeString);
				treeQueue.add(left);
				System.out.println("Queue Size : " + treeQueue.size());
			}

			String rightNodeString = array[index++];
			if (!"#".equals(rightNodeString)) {
				TreeNode right = new TreeNode(Integer.valueOf(rightNodeString));
				node.right = right;
				System.out.println("Add : " + rightNodeString);
				treeQueue.add(right);
				System.out.println("Queue Size : " + treeQueue.size());
			}
			
			for (TreeNode element : treeQueue) {
				
			}
		}
		return root;
	}

	private void printTreeLevely() {
		System.out.println(treeQueue.size());
		int level = 0;
		while (!treeQueue.isEmpty()) {
			for (int index = 0; index < Math.pow(2, level); index++) {
				System.out.println(treeQueue.poll().val);
			}
			System.out.println();
		}
	}

	public boolean recursively() {
		return true;
	}

	public boolean iteratively() {
		return true;
	}

	public static void main(String[] args) {
		String treeString = "{1,2,2,3,4,3,4,#,#,#,#,#,#,#,#}";
		SymmetricTree tree = new SymmetricTree();
		tree.loadFromString(treeString);
		tree.printTreeLevely();
	}

}

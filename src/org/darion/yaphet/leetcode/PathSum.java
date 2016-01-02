package org.darion.yaphet.leetcode;

public class PathSum {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		// System.out.println("Root : " + root.val + "  Sum : " + sum);

		if (root.left == null && root.right == null && (sum - root.val) == 0) {
			// System.out.println("Get : " + root.val);
			return true;
		}

		return hasPathSum(root.left, sum - root.val)
				|| hasPathSum(root.right, sum - root.val);
	}

	public static void main(String[] args) {
		final int result = 22;
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.right = new TreeNode(1);

		PathSum sum = new PathSum();
		System.out.println(sum.hasPathSum(root, result));
	}
}

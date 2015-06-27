package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/invert-binary-tree/
 * 
 * @author 2011204
 * 
 */
public class InvertBinaryTree {
	/**
	 * @param root
	 *            : a TreeNode, the root of the binary tree
	 * @return: nothing
	 */
	public void invertBinaryTree(TreeNode root) {
		if (root == null)
			return;
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
	}

	public static void main(String[] args) {
		InvertBinaryTree instance = new InvertBinaryTree();
		instance.invertBinaryTree(null);
	}
}

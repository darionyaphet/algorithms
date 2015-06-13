package org.darion.algorthms.tree;

public class BinaryTreeMain {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		StringTreeNode root = null;
		
		
		/*
		 * Build a Binary Tree like this : 
		 * 
		 *        5
		 *      /  \ 
		 *     3    9
		 *    / \  / \ 
		 *   1   4 7 10
		 *    \   / \
		 *     2 6   8
		 */
		root = tree.addNode(root, "5");
		root = tree.addNode(root, "3");
		root = tree.addNode(root, "1");
		root = tree.addNode(root, "2");
		root = tree.addNode(root, "4");
		
		root = tree.addNode(root, "9");
		root = tree.addNode(root, "7");
		root = tree.addNode(root, "8");
		root = tree.addNode(root, "6");
		root = tree.addNode(root, "10");

		System.out.println("Builded a Binary Tree");
		System.out.println("Root  : "+root.getElement());
		System.out.println("Left  : "+root.getLeft().getElement());
		System.out.println("Right : "+root.getRight().getElement());
		
		
		tree.levelyTraversal(root);

	}
}

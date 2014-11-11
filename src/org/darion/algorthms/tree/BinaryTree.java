package org.darion.algorthms.tree;

public class BinaryTree<E> {

	private TreeNode<E> root;

	public BinaryTree() {

	}

	public void addNode(E element) {
		if (root == null) {
			root = new TreeNode<E>(element, null, null);
		} else {
			
		}
	}

	public void removeNode() {

	}

	public boolean search() {
		return true;
	}

	public void levelyTraversal() {

	}

	public static void main(String[] args) {
		BinaryTree<String> tree = new BinaryTree<String>();
		tree.addNode("root");
	}
}

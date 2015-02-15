package org.darion.algorthms.tree;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

	private static TreeNode<String> root;

	public BinaryTree() {

	}

	public TreeNode<String> addNode(TreeNode<String> root, String element) {
		if (element == null) {
			throw new IllegalArgumentException("Element Should NOT NULL ! ");
		}

		if (root == null) {
			root = new TreeNode<String>(element, null, null);
			return root;
		} else {
			int result = root.getElement().compareTo(element);
			if (result < 0) {
				root.setRight(addNode(root.getRight(), element));
			} else if (result > 0) {
				root.setLeft(addNode(root.getLeft(), element));
			} else {
				System.out.println("Equal with root-node ...");
			}

			return root;
		}
	}

	public void removeNode() {

	}

	public boolean search() {
		return true;
	}

	public void levelyTraversal() {
		Queue<TreeNode<String>> queue = new LinkedBlockingQueue<TreeNode<String>>();
		queue.add(root);

		while (!queue.isEmpty()) {
			System.out.println("size : " + queue.size());
			TreeNode<String> currentRoot = queue.poll();
			if (currentRoot != null) {
				
				System.out.println(root);
				
				if (currentRoot.hasLeft()) {
					System.out.println("L : " + root.getLeft());
					queue.add(root.getLeft());
				}
				
				if (currentRoot.hasRight()) {
					System.out.println("R : " + root.getRight());
					queue.add(root.getRight());
				}
			}
		}

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		root = tree.addNode(root, "5");
		root = tree.addNode(root, "4");
		root = tree.addNode(root, "6");

		// System.out.println(root);
		// System.out.println(root.getLeft());
		// System.out.println(root.getRight());
		tree.levelyTraversal();

	}
}

package org.darion.algorthms.tree;

import org.darion.algorthms.tree.StringTreeNode;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

	public BinaryTree() {

	}

	public StringTreeNode addNode(StringTreeNode root, String element) {
		if (element == null) {
			throw new IllegalArgumentException("Element Should NOT NULL ! ");
		}

		if (root == null) {
			root = new StringTreeNode(element, null, null);
			return root;
		} else {

			StringTreeNode newNode = new StringTreeNode(element, null, null);
			int result = root.compareTo(newNode);

			if (result > 0) {
				root.setRight(addNode(root.getRight(), element));
			} else if (result < 0) {
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

	public void levelyTraversal(StringTreeNode root) {
		Queue<StringTreeNode> queue = new LinkedBlockingQueue<StringTreeNode>();
		queue.add(root);

		while (!queue.isEmpty()) {
			// System.out.println("size : " + queue.size());
			root = queue.poll();
			if (root != null) {

				System.out.print(root + " ");

				if (root.hasLeft()) {
					queue.add(root.getLeft());
				}

				if (root.hasRight()) {
					queue.add(root.getRight());
				}
			}
		}
		System.out.println();
	}

}

package org.darion.algorthms.tree;

public class TreeNode<E> {
	private E element;
	private TreeNode<E> left;
	private TreeNode<E> right;

	public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}

}

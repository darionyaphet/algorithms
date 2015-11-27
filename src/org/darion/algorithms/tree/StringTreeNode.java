package org.darion.algorithms.tree;

public class StringTreeNode extends AbstractTreeNode<StringTreeNode> {

	private String element;
	private StringTreeNode leftNode;
	private StringTreeNode rightNode;

	public StringTreeNode(String element, StringTreeNode left, StringTreeNode right) {
		this.element = element;
		this.leftNode = left;
		this.rightNode = right;
	}

	public String getElement() {
		return element;
	}

	public boolean hasLeft() {
		return leftNode != null ? true : false;
	}

	public boolean hasRight() {
		return rightNode != null ? true : false;
	}

	public StringTreeNode getLeft() {
		return leftNode;
	}

	public StringTreeNode getRight() {
		return rightNode;
	}

	public void setLeft(StringTreeNode left) {
		this.leftNode = left;
	}

	public void setRight(StringTreeNode right) {
		this.rightNode = right;
	}

	@Override
	public String toString() {
		return element;
	}

	@Override
	public int compareTo(StringTreeNode node) {
		int valueInteger = Integer.valueOf(node.getElement());
		int elementInteger = Integer.valueOf(getElement());

		if (valueInteger > elementInteger) {
			return 1;
		} else if (valueInteger < elementInteger) {
			return -1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		StringTreeNode smallerNode = new StringTreeNode("9", null, null);
		StringTreeNode biggerNode = new StringTreeNode("10", null, null);
		System.out.println(biggerNode.compareTo(smallerNode));
		System.out.println(smallerNode.compareTo(biggerNode));
	}
}

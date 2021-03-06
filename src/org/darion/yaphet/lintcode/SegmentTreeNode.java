package org.darion.yaphet.lintcode;

public class SegmentTreeNode {
	public int start, end;
	public SegmentTreeNode left, right;

	public SegmentTreeNode(int start, int end) {
		this.start = start;
		this.end = end;
		this.left = this.right = null;
	}

	@Override
	public String toString() {
		return "SegmentTreeNode [start=" + start + ", end=" + end + "]";
	}
}

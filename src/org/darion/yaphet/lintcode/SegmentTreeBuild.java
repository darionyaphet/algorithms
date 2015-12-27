package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/segment-tree-build/
 * 
 * @author darion.yaphet
 *
 */
public class SegmentTreeBuild {

	public SegmentTreeNode build(int start, int end) {
		if (start < end) {
			return null;
		}

		SegmentTreeNode node = new SegmentTreeNode(start, end);
		int middle = (start + end) / 2;
		node.left = build(start, middle);
		node.right = build(middle + 1, end);

		return null;
	}

	public static void main(String[] args) {
		SegmentTreeBuild instance = new SegmentTreeBuild();
		System.out.println(instance.build(1, 6));
	}
}

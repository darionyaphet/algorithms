package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/nth-to-last-node-in-list/
 * 
 * @author darion.yaphet
 * 
 */
public class NthToLastNodeInList {
	public NthToLastNodeInList() {

	}

	/**
	 * @param head
	 *            : The first node of linked list.
	 * @param n
	 *            : An integer.
	 * @return: Nth to last node of a singly linked list.
	 */
	ListNode nthToLast(ListNode head, int n) {
		return null;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		NthToLastNodeInList instance = new NthToLastNodeInList();
		ListNode node = instance.nthToLast(head, 1);
		System.out.println(node);
	}
}

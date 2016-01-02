package org.darion.yaphet.leetcode;

import org.darion.yaphet.lintcode.ListNode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 * 
 * @author Darion.Yaphet
 *
 */
public class DeleteNodeinaLinkedList {

	public DeleteNodeinaLinkedList() {

	}

	public void deleteNode(ListNode node) {
		ListNode next = node.next;
		if (next != null) {
			node.val = next.val;
			node.next = next.next;
		} else {
			node.next = null;
		}
	}

	public static void main(String[] args) {
		DeleteNodeinaLinkedList instance = new DeleteNodeinaLinkedList();
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next = new ListNode(3);
		node.next = new ListNode(4);
		instance.deleteNode(new ListNode(3));
	}
}

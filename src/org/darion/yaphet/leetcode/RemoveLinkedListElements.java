package org.darion.yaphet.leetcode;

import org.darion.yaphet.lintcode.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * @author Darion.Yaphet
 *
 */
public class RemoveLinkedListElements {
	public RemoveLinkedListElements() {

	}

	public ListNode removeElements(ListNode head, int val) {
		while (head != null && head.val == val)
			head = head.next;

		if (head == null) {
			return null;
		}

		ListNode previous = head;
		ListNode current = head.next;

		while (current != null) {
			if (current.val == val) {
				previous.next = current.next;
				current = previous.next;
			} else {
				previous = previous.next;
				current = previous.next;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(6);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(4);
		node.next.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next.next = new ListNode(6);

		RemoveLinkedListElements instance = new RemoveLinkedListElements();
		ListNode result = instance.removeElements(node, 6);

		while (result != null) {
			System.out.print(result.val);
			result = result.next;
			if (result != null) {
				System.out.print(" --> ");
			}
		}
	}
}

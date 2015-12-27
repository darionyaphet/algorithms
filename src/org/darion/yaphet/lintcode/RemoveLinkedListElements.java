package org.darion.yaphet.lintcode;

public class RemoveLinkedListElements {

	public RemoveLinkedListElements() {
	}

	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		ListNode prev = head;
		while (true) {
			if (head.val == val) {
				prev.next = head.next;
			}
			if (head.next == null) {
				break;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(4);
		node.next.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next.next = new ListNode(3);

		RemoveLinkedListElements instance = new RemoveLinkedListElements();
		node = instance.removeElements(node, 3);

	}

}

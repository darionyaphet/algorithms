package org.darion.yaphet.leetcode;

import java.util.Stack;

public class ReverseLinkedList {

	public ReverseLinkedList() {
	}

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}

		Stack<ListNode> stack = new Stack<ListNode>();
		while (head != null) {
			stack.push(head);
			head = head.next;
		}

		ListNode reverse = stack.pop();
		ListNode point = reverse;
		while (!stack.isEmpty()) {
			point.next = stack.pop();
		}
		return reverse;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		// while (node != null) {
		// System.out.print(node.val + " ");
		// node = node.next;
		// }
		// System.out.println();
		ReverseLinkedList intance = new ReverseLinkedList();
		ListNode reversedNode = intance.reverseList(node);
		while (reversedNode != null) {
			System.out.print(reversedNode.val + " ");
			reversedNode = reversedNode.next;
		}

	}

}

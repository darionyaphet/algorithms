package org.darion.leetcode;

public class RemoveDuplicatesFromSortedList {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		void demp() {
			ListNode root = this;
			while (root != null) {
				System.out.println(root.val);
				root = root.next;
			}
		}
	}

	public RemoveDuplicatesFromSortedList() {

	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode root = head;
		ListNode list;
		
		while (root != null) {
			if (root.next == null) {
				System.out.println(root.val);
			} else if (root.val != root.next.val) {
				System.out.println(root.val);
			} else {
			}
			root = root.next;
		}
		return root;
	}

	public static void main(String[] args) {
		// ListNode node = new ListNode(1);
		// node.next = new ListNode(1);
		// node.next.next = new ListNode(2);

		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(2);
		node.next.next.next = new ListNode(3);
		node.next.next.next.next = new ListNode(3);
		// node.demp();

		RemoveDuplicatesFromSortedList sortedList = new RemoveDuplicatesFromSortedList();
		ListNode result = sortedList.deleteDuplicates(node);
		// result.demp();
	}

}

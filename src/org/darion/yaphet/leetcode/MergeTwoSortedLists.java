package org.darion.yaphet.leetcode;

import org.darion.yaphet.lintcode.ListNode;

public class MergeTwoSortedLists {

	public MergeTwoSortedLists() {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		ListNode result = null;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				result = new ListNode(l1.val);
				l1 = l1.next;
			} else if (l1.val > l2.val) {
				result = new ListNode(l2.val);
				l2 = l2.next;
			} else {
				result = new ListNode(l1.val);
				l1 = l1.next;

				result = new ListNode(l2.val);
				l2 = l2.next;
			}
		}

//		if (l1 == null) {
//			while(l2.next!=null){
//				
//			}
//		}
//
//		if (l2 == null) {
//
//		}
		return result;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next = new ListNode(5);
		l1.next = new ListNode(7);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next = new ListNode(6);
		l2.next = new ListNode(8);

		MergeTwoSortedLists instance = new MergeTwoSortedLists();
		ListNode result = instance.mergeTwoLists(l1, l2);
		while (result.next != null) {
			System.out.print(result.val + " --> ");
			result = result.next;
		}
	}
}

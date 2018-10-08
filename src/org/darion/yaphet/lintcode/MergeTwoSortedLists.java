package org.darion.yaphet.lintcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null)
            return l2;

        if (l1 != null && l2 == null)
            return l1;

        if (l1 == null && l2 == null)
            return null;

        ListNode head = new ListNode(0);
        ListNode current = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            }
        }

        if (l1 != null)
            current.next = l1;
        if (l2 != null)
            current.next = l2;
        return head.next;
    }

    public static void main(String[] args) {
        //1->3->8->11->15->null
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(11);
        l1.next.next.next.next = new ListNode(15);

        //2->null
        ListNode l2 = new ListNode(2);

        MergeTwoSortedLists instance = new MergeTwoSortedLists();
        ListNode result = instance.mergeTwoLists(l1, l2);
        System.out.println(result.val);
        System.out.println(result.next.val);
        System.out.println(result.next.next.val);
        System.out.println(result.next.next.next.val);
        System.out.println(result.next.next.next.next.val);
        System.out.println(result.next.next.next.next.next.val);
    }
}

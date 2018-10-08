package org.darion.yaphet.lintcode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        if (n <= 0 || p1 == null)
            return p1;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        head = dummy;
        ListNode slow = head.next;
        ListNode fast = head.next;
        while (n >= 1) {
            fast = fast.next;
            n--;
        }

        if (fast == null)
            return head.next.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthNodeFromEndOfList instance = new RemoveNthNodeFromEndOfList();
        head = instance.removeNthFromEnd(head, 1);

        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
    }
}

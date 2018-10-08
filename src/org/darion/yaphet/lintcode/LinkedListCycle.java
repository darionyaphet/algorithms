package org.darion.yaphet.lintcode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode one = head;
        ListNode two = head.next;

        while (two.next != null && two.next.next != null) {
            if (one.val == two.val) {
                return true;
            } else {
                one = one.next;
                two = two.next.next;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);

        LinkedListCycle instance = new LinkedListCycle();
        System.out.println(instance.hasCycle(head));
    }
}

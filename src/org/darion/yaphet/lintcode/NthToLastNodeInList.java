package org.darion.yaphet.lintcode;

public class NthToLastNodeInList {
    public ListNode nthToLast(ListNode head, int n) {
        int counter = -1 * n;
        ListNode pointer = head;
        ListNode result = null;
        while (head != null) {
            counter += 1;
            if (counter >= 0) {
                result = pointer;
                pointer = pointer.next;
            }
            head = head.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(7);

        NthToLastNodeInList instance = new NthToLastNodeInList();
        System.out.println(instance.nthToLast(head, 2).val);
    }
}

package org.darion.yaphet.lintcode;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }

        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode walker = helper;
        ListNode runner = helper;
        while (runner.next != null) {
            if (runner.next.val < x) {
                if (walker != runner) {
                    ListNode next = runner.next.next;
                    runner.next.next = walker.next;
                    walker.next = runner.next;
                    runner.next = next;
                } else
                    runner = runner.next;
                walker = walker.next;
            } else {
                runner = runner.next;
            }
        }
        return helper.next;
    }

    public static void main(String[] args) {
        PartitionList instance = new PartitionList();
        ListNode head = new ListNode(1);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);

        System.out.println(instance.partition(head, 3).val);
    }
}

package org.darion.yaphet.lintcode;


/**
 * http://www.lintcode.com/zh-cn/problem/reverse-linked-list/
 */
public class ReverseLinkedList {
    public static ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root = reverse(root);
        System.out.println(root.val);
        System.out.println(root.next.val);
        System.out.println(root.next.next.val);
    }
}

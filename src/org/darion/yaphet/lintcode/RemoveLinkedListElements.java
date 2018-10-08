package org.darion.yaphet.lintcode;

import java.util.List;

/**
 * http://www.lintcode.com/zh-cn/problem/remove-linked-list-elements/
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode previous = head;
        ListNode pointer = head;

        while (head != null) {
            if (head.val == val) {
                if (head == pointer) {
                    pointer = pointer.next;
                }
                previous.next = head.next;
                head = head.next;
            } else {
                previous = head;
                head = head.next;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements instance = new RemoveLinkedListElements();
//        ListNode node = new ListNode(1);
//        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(3);
//        node.next.next.next.next = new ListNode(4);
//        node.next.next.next.next.next = new ListNode(5);
//        node.next.next.next.next.next.next = new ListNode(3);
//
//        ListNode newNode = instance.removeElements(node, 3);
//        System.out.println(newNode.val);
//        System.out.println(newNode.next.val);
//        System.out.println(newNode.next.next.val);
//        System.out.println(newNode.next.next.next.val);

        // 1->1->null

        ListNode node = new ListNode(1);
        node.next = new ListNode(1);

        ListNode newNode = instance.removeElements(node, 1);
        System.out.println(newNode.val);
    }
}

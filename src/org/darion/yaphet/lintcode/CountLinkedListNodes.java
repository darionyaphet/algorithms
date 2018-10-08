package org.darion.yaphet.lintcode;

/**
 * http://www.lintcode.com/zh-cn/problem/count-linked-list-nodes/
 */
public class CountLinkedListNodes {
    public int countNodes(ListNode head) {
        if (head == null) {
            return 0;
        }

        int counter = 0;
        while (head != null) {
            counter += 1;
            head = head.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        CountLinkedListNodes instance = new CountLinkedListNodes();
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(5);
        System.out.println(instance.countNodes(node));
    }
}

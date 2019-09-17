package medium;

import common.ListNode;

/**
 * 92. 反转链表 II
 *
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * @author mascot
 * @date 2019/9/17 17:56
 */
public class ReverseLinkedList {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        final ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }

        ListNode current = pre.next;
        for (int i = m; i < n; i++) {
            ListNode node = current.next;
            current.next = node.next;
            node.next = pre.next;
            pre.next = node;
        }

        return dummy.next;
    }
}

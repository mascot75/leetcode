package medium;

/**
 * 61. 旋转链表
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * @author mascot
 * @date 2019/7/2 16:59
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        ListNode oldTail = head;
        int count = 1;
        while (oldTail.next != null) {
            count++;
            oldTail = oldTail.next;
        }

        oldTail.next = head;
        ListNode newTail = head;
        k %= count;
        while (count - k - 1 > 0) {
            newTail = newTail.next;
            count--;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public ListNode rotateRightOld(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode tail = temp;
        int count = 0;
        while (tail.next != null) {
            count++;
            tail = tail.next;
        }

        ListNode node = temp;
        k %= count;
        while (count - k > 0) {
            node = node.next;
            count--;
        }

        tail.next = temp.next;
        temp.next = node.next;
        node.next = null;
        return temp.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int x) { val = x; }
    }
}


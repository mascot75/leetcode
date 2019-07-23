package medium;

/**
 * 148. 排序链表
 *
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 *
 * @author mascot
 * @date 2019/7/23 18:07
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        return null == head ? null : sort(head);
    }

    private ListNode sort(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode front = head, tail = head, mid = null;
        while (tail != null && tail.next != null) {
            mid = front;
            front = front.next;
            tail = tail.next.next;
        }
        mid.next = null;

        return merge(sort(head), sort(front));
    }

    private ListNode merge(ListNode right, ListNode left) {
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;
        while (right != null && left != null) {
            if (right.val < left.val) {
                current.next = right;
                current = current.next;
                right = right.next;
            } else {
                current.next = left;
                current = current.next;
                left = left.next;
            }
        }

        if (right != null) {
            current.next = right;
        }

        if (left != null) {
            current.next = left;
        }
        return dummyHead.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

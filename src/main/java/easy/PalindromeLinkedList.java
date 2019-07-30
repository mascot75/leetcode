package easy;
import common.ListNode;

/**
 * 234. 回文链表
 *
 * 请判断一个链表是否为回文链表。
 *
 * @author mascot
 * @date 2019/7/30 18:12
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reserve(slow);

        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reserve(ListNode node) {
        if (node.next == null) {
            return node;
        }

        ListNode newHead = reserve(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }
}

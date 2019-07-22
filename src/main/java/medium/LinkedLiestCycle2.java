package medium;

/**
 * 142. 环形链表 II
 *
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 *
 * 说明：不允许修改给定的链表。
 *
 * @author mascot
 * @date 2019/7/22 13:28
 */
public class LinkedLiestCycle2 {
    public ListNode detectCycle(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        int count = 1;
        fast = fast.next;
        while (fast != slow) {
            count++;
            fast = fast.next;
        }

        fast = head;
        slow = head;
        while (count-- != 0) {
            fast = fast.next;
        }
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    class ListNode {
        private int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

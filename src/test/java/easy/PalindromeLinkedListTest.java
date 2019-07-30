package easy;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/30 18:35
 */
public class PalindromeLinkedListTest {

    private PalindromeLinkedList linkedList = new PalindromeLinkedList();

    @Test
    public void isPalindrome() {
        final ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        assertFalse(linkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome2() {
        final ListNode head = new ListNode(1);
        final ListNode node1 = new ListNode(2);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        assertTrue(linkedList.isPalindrome(head));
    }

    @Test
    public void isPalindrome3() {
        final ListNode head = new ListNode(1);
        final ListNode node1 = new ListNode(2);
        final ListNode node2 = new ListNode(2);
        final ListNode node3 = new ListNode(2);
        node3.next = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        assertTrue(linkedList.isPalindrome(head));
    }
}
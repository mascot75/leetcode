package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/2 17:08
 */
public class RotateListTest {

    private RotateList rotateList = new RotateList();
    @Test
    public void rotateRight() {
        RotateList.ListNode head = new RotateList.ListNode(1);
        head.next = new RotateList.ListNode(2);
        head.next.next = new RotateList.ListNode(3);
        head.next.next.next = new RotateList.ListNode(4);
        head.next.next.next.next = new RotateList.ListNode(5);

        rotateList.rotateRight(head, 2);
    }
}
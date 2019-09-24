package easy;

/**
 * 237. 删除链表中的节点
 *
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 *
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 *
 * @author mascot
 * @date 2019/9/24 20:19
 */
public class DeleteNode_237 {
    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}

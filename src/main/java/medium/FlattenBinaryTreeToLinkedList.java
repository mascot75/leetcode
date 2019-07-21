package medium;

/**
 * 114. 二叉树展开为链表
 *
 * 给定一个二叉树，原地将它展开为链表。
 *
 * @author mascot
 * @date 2019/7/21 17:56
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);
        if (root.left != null) {
            TreeNode left = root.left;
            TreeNode tail = left;
            while (tail.right != null) {
                tail = tail.right;
            }
            tail.right = root.right;
            root.right = left;
            root.left = null;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }
}

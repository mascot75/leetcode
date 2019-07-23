package easy;

/**
 * 226. 翻转二叉树
 *
 * 翻转一棵二叉树。
 *
 * @author mascot
 * @date 2019/7/23 19:09
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        invert(root.right);
        invert(root.left);

        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
    }
}

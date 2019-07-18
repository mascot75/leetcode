package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 *
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * @author mascot
 * @date 2019/7/18 14:49
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal2(result, root);
        return result;
    }

    private void inorderTraversal2(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal2(result, root.left);
        result.add(root.val);
        inorderTraversal2(result, root.right);
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || stack.size() > 0) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }

        return result;
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


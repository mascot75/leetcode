package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 145. 二叉树的后序遍历
 *
 * 给定一个二叉树，返回它的 后序 遍历。
 *
 * @author mascot
 * @date 2019/7/18 15:39
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorderTraversal2(result, root);
        return result;
    }

    private void postorderTraversal2(List<Integer> result, TreeNode root) {
        if (root == null) {
            return;
        }

        postorderTraversal2(result, root.left);
        postorderTraversal2(result, root.right);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

       TreeNode node = root;
       TreeNode preNode = null;
        while (node != null || stack.size() > 0) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.peek();
            if (node.right == null || node.right == preNode) {
                result.add(node.val);
                preNode = node;
                stack.pop();
                node = null;
            } else {
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

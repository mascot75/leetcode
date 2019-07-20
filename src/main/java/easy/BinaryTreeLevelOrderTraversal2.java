package easy;

import java.util.*;

/**
 * 107. 二叉树的层次遍历 II
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * @author mascot
 * @date 2019/7/19 14:40
 */
public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int currentSize = queue.size();
            List<Integer> list = new ArrayList<>();
            while (currentSize-- > 0) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(0, list);
        }
        return result;
    }

    public List<List<Integer>> levelOrderBottom2(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        visit(result, 0, root);
        Collections.reverse(result);
        return result;
    }

    private void visit(List<List<Integer>> result, int depth, TreeNode node) {
        if (node == null) {
            return;
        }

        if (result.size() == depth) {
            result.add(new ArrayList<>());
        }
        result.get(depth).add(node.val);
        visit(result, depth + 1, node.left);
        visit(result, depth + 1, node.right);
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

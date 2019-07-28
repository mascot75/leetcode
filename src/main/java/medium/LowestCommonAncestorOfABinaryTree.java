package medium;

import common.TreeNode;

import java.util.Stack;

/**
 * 236. 二叉树的最近公共祖先
 *
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * @author mascot
 * @date 2019/7/28 19:10
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        Stack<TreeNode> stackP = new Stack<>();
        getPath(root, p, stackP);
        Stack<TreeNode> stackQ = new Stack<>();
        getPath(root, q, stackQ);

        int diff = stackP.size() - stackQ.size();
        if (diff > 0) {
            while (diff-- > 0) {
                stackP.pop();
            }
        } else {
            while (diff++ < 0) {
                stackQ.pop();
            }
        }
        TreeNode nodeP;
        TreeNode nodeQ;
        while (!stackP.empty() && !stackQ.empty()) {
            nodeP = stackP.pop();
            nodeQ = stackQ.pop();
            if (nodeP == nodeQ) {
                return nodeP;
            }
        }

        return null;
    }

    private boolean getPath(TreeNode root, TreeNode node, Stack<TreeNode> stack) {
        stack.push(root);
        if (node == root) {
            return true;
        }

        boolean find = false;
        if (root.left != null) {
            find = getPath(root.left, node, stack);
        }

        if (!find && root.right != null) {
            find = getPath(root.right, node, stack);
        }

        if (!find) {
            stack.pop();
            return false;
        }
        return true;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null) {
            return null;
        }
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}

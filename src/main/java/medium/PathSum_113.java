package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 113. 路径总和 II
 *
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * @author mascot
 * @date 2019/8/20 19:59
 */
public class PathSum_113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        visit(result, root, 0, sum, new ArrayList<>());
        return result;
    }

    private void visit(List<List<Integer>> result, TreeNode root, int currentSum, int sum, List<Integer> list) {
        if (root == null) {
            return;
        }

        currentSum += root.val;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (currentSum == sum) {
                result.add(new ArrayList<>(list));
            }

            list.remove(list.size() - 1);
            return;
        }

        visit(result, root.left, currentSum, sum, list);
        visit(result, root.right, currentSum, sum, list);
        list.remove(list.size() - 1);
    }
}

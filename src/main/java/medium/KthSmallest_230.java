package medium;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mascot
 * @date 2019/9/23 19:27
 */
public class KthSmallest_230 {
    private int result, count;
    public int kthSmallest2(TreeNode root, int k) {
        visit2(root, k);
        return result;
    }

    private void visit2(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        visit2(root.left, k);
        if (++count == k) {
            result = root.val;
        }
        visit2(root.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        visit(root, result);
        return result.get(k - 1);
    }

    private void visit(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        visit(root.left, result);
        result.add(root.val);
        visit(root.right, result);
    }
}

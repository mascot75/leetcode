package easy;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 * @author mascot
 * @date 2019/4/14 11:20
 */
public class Symmetric {
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }

        if (tree1 == null || tree2 == null) {
            return false;
        }

        return (tree1.val == tree2.val) && isMirror(tree1.left, tree2.right) && isMirror(tree1.right, tree2.left);
    }
}

package medium;

/**
 * 106. 从中序与后序遍历序列构造二叉树
 *
 * @author mascot
 * @date 2019/7/20 15:39
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder == null || inorder == null || inorder.length == 0 || inorder.length != postorder.length) {
            return null;
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, postorder.length - 1);

    }

    private TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pRoot) {
        if (iStart > iEnd) {
            return null;
        }

        int iRoot = 0;
        for (int i = iStart; i <= iEnd; i++) {
            if (postorder[pRoot] == inorder[i]) {
                iRoot = i;
                break;
            }
        }

        final TreeNode node = new TreeNode(inorder[iRoot]);
        node.left = buildTree(inorder, iStart, iRoot - 1, postorder, pRoot - (iEnd - iRoot) - 1);
        node.right = buildTree(inorder, iRoot + 1, iEnd, postorder, pRoot - 1);
        return node;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromInorderAndPostorderTraversal tree = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        tree.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        tree.buildTree(new int[]{2, 1}, new int[]{2, 1});

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

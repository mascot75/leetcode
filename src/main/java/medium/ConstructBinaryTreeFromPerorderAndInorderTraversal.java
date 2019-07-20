package medium;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 *
 * @author mascot
 * @date 2019/7/20 11:18
 */
public class ConstructBinaryTreeFromPerorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || inorder.length == 0 || inorder.length != preorder.length) {
            return null;
        }
        return buildTree(preorder, inorder, 0, 0, inorder.length - 1);

    }

    private TreeNode buildTree(int[] preorder, int[] inorder, int pRoot, int iStart, int iEnd) {
        if (iStart > iEnd) {
            return null;
        }

        int iRoot = 0;
        for (int i = iStart; i <= iEnd; i++) {
            if (preorder[pRoot] == inorder[i]) {
                iRoot = i;
                break;
            }
        }

        final TreeNode node = new TreeNode(inorder[iRoot]);
        node.left = buildTree(preorder, inorder,pRoot + 1, iStart, iRoot - 1);
        node.right = buildTree(preorder, inorder, pRoot + (iRoot - iStart) + 1, iRoot + 1, iEnd);
        return node;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPerorderAndInorderTraversal tree = new ConstructBinaryTreeFromPerorderAndInorderTraversal();
        tree.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        tree.buildTree(new int[]{1, 2, 3}, new int[]{3, 2, 1});
        tree.buildTree(new int[]{1, 2, 3}, new int[]{2, 3, 1});
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

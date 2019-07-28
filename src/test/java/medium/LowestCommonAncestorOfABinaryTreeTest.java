package medium;

import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/28 20:08
 */
public class LowestCommonAncestorOfABinaryTreeTest {

    LowestCommonAncestorOfABinaryTree tree = new LowestCommonAncestorOfABinaryTree();

    @Test(timeout = 1000)
    public void lowestCommonAncestor() {
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        three.left = five;
        three.right = one;
        five.left = six;
        five.right = two;
        one.left = zero;
        one.right = eight;
        two.left = seven;
        two.right = four;

        assertEquals(five, tree.lowestCommonAncestor(three, five, four));

    }
}
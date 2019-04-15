package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/13 22:48
 */
public class SameTreeTest {

    private SameTree sameTree = new SameTree();

    @Test
    public void isSameTree() {
        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);
        one.right = new TreeNode(3);

        TreeNode two = new TreeNode(1);
        two.left = new TreeNode(2);
        two.right = new TreeNode(3);

        assertTrue(sameTree.isSameTree(one, two));
    }

    @Test
    public void isSameTree2() {
        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);


        TreeNode two = new TreeNode(1);
        two.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(one, two));
    }

    @Test
    public void isSameTree3() {
        TreeNode one = new TreeNode(1);
        one.left = new TreeNode(2);
        one.right = new TreeNode(1);

        TreeNode two = new TreeNode(1);
        two.left = new TreeNode(1);
        two.right = new TreeNode(2);

        assertFalse(sameTree.isSameTree(one, two));
    }
}
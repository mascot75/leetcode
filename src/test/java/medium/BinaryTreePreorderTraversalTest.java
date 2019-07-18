package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/18 15:27
 */
public class BinaryTreePreorderTraversalTest {

    private BinaryTreePreorderTraversal traversal = new BinaryTreePreorderTraversal();

    @Test
    public void preorderTraversal() {

        BinaryTreePreorderTraversal.TreeNode root = new BinaryTreePreorderTraversal.TreeNode(1);
        BinaryTreePreorderTraversal.TreeNode right = new BinaryTreePreorderTraversal.TreeNode(2);
        root.right = right;
        right.left = new BinaryTreePreorderTraversal.TreeNode(3);

        assertThat(new ArrayList<>(Arrays.asList(1, 2, 3)), is(traversal.preorderTraversal(root)));
    }
}
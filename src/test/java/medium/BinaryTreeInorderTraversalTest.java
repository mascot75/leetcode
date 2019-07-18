package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/18 14:51
 */
public class BinaryTreeInorderTraversalTest {

    private BinaryTreeInorderTraversal traversal = new BinaryTreeInorderTraversal();

    @Test
    public void inorderTraversal() {

        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        BinaryTreeInorderTraversal.TreeNode right = new BinaryTreeInorderTraversal.TreeNode(2);
        root.right = right;
        right.left = new BinaryTreeInorderTraversal.TreeNode(3);

        assertThat(new ArrayList<>(Arrays.asList(1, 3, 2)), is(traversal.inorderTraversal(root)));
    }
}
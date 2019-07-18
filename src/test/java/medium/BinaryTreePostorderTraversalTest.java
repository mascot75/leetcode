package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/18 15:41
 */
public class BinaryTreePostorderTraversalTest {

    private BinaryTreePostorderTraversal traversal = new BinaryTreePostorderTraversal();
    
    @Test(timeout = 1000)
    public void postorderTraversal() {
        BinaryTreePostorderTraversal.TreeNode root = new BinaryTreePostorderTraversal.TreeNode(1);
        BinaryTreePostorderTraversal.TreeNode right = new BinaryTreePostorderTraversal.TreeNode(2);
        root.right = right;
        right.left = new BinaryTreePostorderTraversal.TreeNode(3);

        assertThat(new ArrayList<>(Arrays.asList(3, 2, 1)), is(traversal.postorderTraversal(root)));
    }
}
package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/19 14:08
 */
public class BinaryTreeLevelOrderTraversalTest {

    private BinaryTreeLevelOrderTraversal traversal = new BinaryTreeLevelOrderTraversal();

    @Test(timeout = 1000)
    public void levelOrder() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Collections.singleton(3)));
        lists.add(new ArrayList<>(Arrays.asList(9, 20)));
        lists.add(new ArrayList<>(Arrays.asList(15, 7)));

        BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(3);
        root.left = new BinaryTreeLevelOrderTraversal.TreeNode(9);
        BinaryTreeLevelOrderTraversal.TreeNode right = new BinaryTreeLevelOrderTraversal.TreeNode(20);
        root.right = right;
        right.left = new BinaryTreeLevelOrderTraversal.TreeNode(15);
        right.right = new BinaryTreeLevelOrderTraversal.TreeNode(7);

        assertThat(lists, is(traversal.levelOrder(root)));
    }
}
package easy;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/19 14:47
 */
public class BinaryTreeLevelOrderTraversal2Test {

    private BinaryTreeLevelOrderTraversal2 traversal2 = new BinaryTreeLevelOrderTraversal2();

    @Test
    public void levelOrderBottom() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>(Arrays.asList(15, 7)));
        lists.add(new ArrayList<>(Arrays.asList(9, 20)));
        lists.add(new ArrayList<>(Collections.singleton(3)));

        BinaryTreeLevelOrderTraversal2.TreeNode root = new BinaryTreeLevelOrderTraversal2.TreeNode(3);
        root.left = new BinaryTreeLevelOrderTraversal2.TreeNode(9);
        BinaryTreeLevelOrderTraversal2.TreeNode right = new BinaryTreeLevelOrderTraversal2.TreeNode(20);
        root.right = right;
        right.left = new BinaryTreeLevelOrderTraversal2.TreeNode(15);
        right.right = new BinaryTreeLevelOrderTraversal2.TreeNode(7);

        assertThat(lists, is(traversal2.levelOrderBottom(root)));
    }
}
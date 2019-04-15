package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/14 11:21
 */
public class SymmetricTest {

    private Symmetric symmetric = new Symmetric();
    @Test
    public void isSymmetric() {

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(2);
        TreeNode four = new TreeNode(3);
        TreeNode five = new TreeNode(3);
        TreeNode six = new TreeNode(4);
        TreeNode seven = new TreeNode(4);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = six;
        three.left = seven;
        three.right = five;
        assertTrue(symmetric.isSymmetric(one));
    }
}
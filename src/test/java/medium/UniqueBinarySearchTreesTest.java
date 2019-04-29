package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/24 17:05
 */
public class UniqueBinarySearchTreesTest {

    private UniqueBinarySearchTrees trees = new UniqueBinarySearchTrees();

    @Test
    public void numTrees() {
        assertEquals(5, trees.numTrees(3));
    }
}
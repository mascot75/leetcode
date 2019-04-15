package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/13 22:16
 */
public class MinPathSumTest {

    private MinPathSum sum = new MinPathSum();

    @Test
    public void minPathSum() {
        assertEquals(7, sum.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        assertEquals(8, sum.minPathSum(new int[][]{{1, 2}, {5, 6}, {1, 1}}));
    }
}
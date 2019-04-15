package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/13 15:25
 */
public class MinCostClimbingStairsTest {

    private MinCostClimbingStairs min = new MinCostClimbingStairs();
    @Test
    public void minCostClimbingStairs() {
        assertEquals(1, min.minCostClimbingStairs(new int[]{1, 2}));
        assertEquals(15, min.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, min.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
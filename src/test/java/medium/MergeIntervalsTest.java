package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/6/26 20:03
 */
public class MergeIntervalsTest {

    private MergeIntervals intervals = new MergeIntervals();

    @Test(timeout = 1000)
    public void merge() {


        assertEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                intervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));

        assertEquals(new int[][]{{1, 5}},
                intervals.merge(new int[][]{{1, 4}, {4, 5}}));

        assertEquals(new int[][]{},
                intervals.merge(new int[][]{}));
    }
}
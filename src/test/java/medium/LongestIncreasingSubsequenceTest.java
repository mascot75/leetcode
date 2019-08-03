package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/3 18:03
 */
public class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
    @Test
    public void lengthOfLIS() {
        assertEquals(4, subsequence.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
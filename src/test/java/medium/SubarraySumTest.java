package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/11 19:59
 */
public class SubarraySumTest {

    private SubarraySum subarraySum = new SubarraySum();

    @Test
    public void subarraySum() {
        assertEquals(2, subarraySum.subarraySum(new int[]{1, 1, 1}, 2));
    }
}
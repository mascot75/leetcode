package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/24 15:46
 */
public class MaximumProductSubarrayTest {

    private MaximumProductSubarray subarray = new MaximumProductSubarray();

    @Test(timeout = 100)
    public void maxProduct() {
        assertEquals(6, subarray.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, subarray.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(4, subarray.maxProduct(new int[]{3, -1, 4}));

    }
}
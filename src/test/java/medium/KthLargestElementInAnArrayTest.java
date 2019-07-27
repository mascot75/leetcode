package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/27 19:41
 */
public class KthLargestElementInAnArrayTest {

    private KthLargestElementInAnArray anArray = new KthLargestElementInAnArray();

    @Test
    public void findKthLargest() {
        assertEquals(5, anArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }
}
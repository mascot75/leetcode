package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author mascot
 * @date 2019/7/11 19:10
 */
public class TwoSum2Test {
    private TwoSum2 twoSum2 = new TwoSum2();

    @Test
    public void towSum() {
        assertArrayEquals(new int[]{1, 2}, twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

}
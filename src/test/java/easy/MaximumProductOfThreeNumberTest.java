package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/24 16:36
 */
public class MaximumProductOfThreeNumberTest {

    private MaximumProductOfThreeNumber number = new MaximumProductOfThreeNumber();

    @Test

    public void maximumProduct() {
        assertEquals(6, number.maximumProduct(new int[]{1, 2, 3}));
        assertEquals(24, number.maximumProduct(new int[]{1, 2, 3, 4}));

    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/31 16:43
 */
public class ProductOfArrayExeptSelfTest {

    private ProductOfArrayExeptSelf self = new ProductOfArrayExeptSelf();

    @Test
    public void productExceptSelf() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, self.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}
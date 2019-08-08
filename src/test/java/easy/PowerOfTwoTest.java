package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/8 17:19
 */
public class PowerOfTwoTest {

    private PowerOfTwo powerOfTwo = new PowerOfTwo();

    @Test
    public void isPowerOfTwo() {
        assertTrue(powerOfTwo.isPowerOfTwo(1));
        assertTrue(powerOfTwo.isPowerOfTwo(16));
        assertFalse(powerOfTwo.isPowerOfTwo(218));
    }
}
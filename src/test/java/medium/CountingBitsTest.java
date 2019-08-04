package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/4 19:52
 */
public class CountingBitsTest {

    private CountingBits bits = new CountingBits();

    @Test
    public void countBits() {
        assertArrayEquals(new int[]{0, 1, 1}, bits.countBits(2));
    }

    @Test
    public void countBits2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, bits.countBits3(5));
    }
}
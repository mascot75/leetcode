package easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/3/4 19:53
 */
public class PlusOneTest {
    private PlusOne plusOne = new PlusOne();

    @Test
    public void plusOne() {

        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{9, 0, 0}, plusOne.plusOne(new int[]{8, 9, 9}));
    }
}
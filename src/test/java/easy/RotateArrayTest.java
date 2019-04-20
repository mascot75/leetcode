package easy;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/20 15:32
 */
public class RotateArrayTest {

    private RotateArray rotate = new RotateArray();

    @Test
    public void rotate() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate.rotate(array, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, array);
    }

    @Test
    public void rotate2() {
        int[] array = new int[]{-1, -100, 3, 99};
        rotate.rotate(array, 3);
        assertArrayEquals(new int[]{3, 99, -1, -100}, array);
    }
}
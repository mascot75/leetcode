package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/14 13:25
 */
public class SortsColorsTest {

    private SortsColors sortsColors = new SortsColors();

    @Test
    public void sortColors() {
        int[] array = new int[]{2, 0, 2, 1, 1, 0};
        sortsColors.sortColors(array);
        assertArrayEquals(array, new int[]{0, 0, 1, 1, 2, 2});
    }
}
package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/18 19:49
 */
public class RotateTest {

    private Rotate rotate = new Rotate();

    @Test
    public void rotate() {
        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate.rotate(array);
        assertArrayEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, array);
    }

    @Test
    public void rotate2() {
        int[][] array = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate.rotate(array);
        assertArrayEquals(new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}}, array);
    }
}
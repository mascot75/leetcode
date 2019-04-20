package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/20 13:35
 */
public class SpiralMatrixTwoTest {

    private SpiralMatrixTwo two = new SpiralMatrixTwo();

    @Test
    public void generateMatrix() {
        assertArrayEquals(new int[][]{ {1, 2, 3 }, {8, 9, 4 }, {7, 6, 5 }}, two.generateMatrix(3));
    }
}
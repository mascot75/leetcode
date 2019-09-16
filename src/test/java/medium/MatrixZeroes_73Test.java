package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/9/16 19:21
 */
public class MatrixZeroes_73Test {

    private MatrixZeroes_73 matrixZeroes_73 = new MatrixZeroes_73();

    @Test
    public void setZeroes() {
        int[][] array = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        matrixZeroes_73.setZeroes(array);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, array);
    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/1 17:51
 */
public class SearchA2BMatrix2Test {

    private SearchA2BMatrix2 matrix2 = new SearchA2BMatrix2();

    @Test
    public void searchMatrix() {
        assertFalse(matrix2.searchMatrix(new int[][]{{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}}, 20));
    }

    @Test
    public void searchMatrix2() {
        assertTrue(matrix2.searchMatrix(new int[][]{{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}}, 5));
    }

    @Test
    public void searchMatrix3() {
        assertTrue(matrix2.searchMatrix(new int[][]{{-5}}, -5));
    }
}
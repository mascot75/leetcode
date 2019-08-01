package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/1 18:22
 */
public class SearchA2BMatrixTest {

    private SearchA2BMatrix matrix = new SearchA2BMatrix();

    @Test
    public void searchMatrix() {
        assertTrue(matrix.searchMatrix(new int[][]{{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}}, 11));
    }

    @Test
    public void searchMatrix2() {
        assertFalse(matrix.searchMatrix(new int[][]{{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}}, 13));
    }

    @Test
    public void searchMatrix3() {
        assertFalse(matrix.searchMatrix(new int[][]{{1, 1}}, 2));
    }
}
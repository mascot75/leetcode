package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/2 18:32
 */
public class PerfectSquaresTest {

    private PerfectSquares squares = new PerfectSquares();

    @Test
    public void numSquares() {
        assertEquals(3, squares.numSquares(12));
        assertEquals(2, squares.numSquares(13));
    }
}
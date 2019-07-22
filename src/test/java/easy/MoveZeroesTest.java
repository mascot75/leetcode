package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/22 14:38
 */
public class MoveZeroesTest {

    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test(timeout = 100)
    public void moveZeroes() {
        final int[] ints = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(ints);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, ints);
    }

    @Test(timeout = 100)
    public void moveZeroes2() {
        final int[] ints = {0, 0};
        moveZeroes.moveZeroes(ints);
        assertArrayEquals(new int[]{0, 0}, ints);
    }

    @Test(timeout = 100)
    public void moveZeroes3() {
        final int[] ints = {1, 0};
        moveZeroes.moveZeroes(ints);
        assertArrayEquals(new int[]{1, 0}, ints);
    }
}

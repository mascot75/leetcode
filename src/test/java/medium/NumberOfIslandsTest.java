package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/26 15:50
 */
public class NumberOfIslandsTest {

    private NumberOfIslands islands = new NumberOfIslands();

    @Test(timeout = 100)
    public void numIslands() {
        assertEquals(1, islands.numIslands(new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}}));
    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/21 14:45
 */
public class UniquePathsTwoTest {

    private UniquePathsTwo two = new UniquePathsTwo();

    @Test
    public void uniquePathsWithObstacles() {
        assertEquals(2, two.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }
}
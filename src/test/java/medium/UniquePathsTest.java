package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/21 11:11
 */
public class UniquePathsTest {

    private  UniquePaths paths = new UniquePaths();

    @Test
    public void uniquePaths() {
        assertEquals(3, paths.uniquePaths(3,2));
    }

    @Test
    public void uniquePaths2() {
        assertEquals(28, paths.uniquePaths(7,3));
    }
}
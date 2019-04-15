package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/13 14:58
 */
public class RobTest {

    private Rob rob = new Rob();
    @Test
    public void rob() {
        assertEquals(0, rob.rob(new int[]{}));
        assertEquals(3, rob.rob(new int[]{3}));
        assertEquals(4, rob.rob(new int[]{1, 3, 2, 1}));
        assertEquals(12, rob.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void rob2() {
        assertEquals(0, rob.rob2(new int[]{}));
        assertEquals(3, rob.rob2(new int[]{3}));
        assertEquals(4, rob.rob2(new int[]{1, 3, 2, 1}));
        assertEquals(12, rob.rob2(new int[]{2, 7, 9, 3, 1}));
    }
}
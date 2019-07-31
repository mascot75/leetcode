package hard;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/31 17:07
 */
public class TrappingRainWaterTest {

    private TrappingRainWater water = new TrappingRainWater();

    @Test
    public void trap() {
        assertEquals(6, water.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
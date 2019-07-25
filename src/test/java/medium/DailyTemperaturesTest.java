package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 739. 每日温度
 *
 * @author mascot
 * @date 2019/7/25 22:26
 */
public class DailyTemperaturesTest {

    private DailyTemperatures temperatures = new DailyTemperatures();

    @Test
    public void dailyTemperatures() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                temperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/4 18:18
 */
public class CoinChangeTest {

    private CoinChange coinChange = new CoinChange();

    @Test
    public void coinChange() {
        assertEquals(3, coinChange.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void coinChange2() {
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/9 19:40
 */
public class MaxProfit_309Test {

    private MaxProfit_309 profit_309 = new MaxProfit_309();

    @Test
    public void maxProfit() {
        assertEquals(3, profit_309.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }
}
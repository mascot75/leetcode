package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/3 18:45
 */
public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock sellStock = new BestTimeToBuyAndSellStock();

    @Test
    public void maxProfit() {
        assertEquals(7, sellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, sellStock.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, sellStock.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
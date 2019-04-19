package medium;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/19 17:12
 */
public class SpiralOrderTest {

    private SpiralOrder order = new SpiralOrder();

    @Test
    public void spiralOrder() {

        assertThat(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5),
                is(order.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));

    }

    @Test
    public void spiralOrder3() {
        assertThat(Arrays.asList(6,9,7), is(order.spiralOrder(new int[][]{{6,9,7}})));
    }

    @Test
    public void spiralOrder2() {

        assertThat(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                is(order.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})));

    }
}
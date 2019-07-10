package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/10 18:04
 */
public class SingleNumberTest {

    private SingleNumber singleNumber = new SingleNumber();

    @Test
    public void singleNumber() {
        assertEquals(0, singleNumber.singleNumber(new int[]{0}));
        assertEquals(1, singleNumber.singleNumber(new int[]{1, 2, 2}));
        assertEquals(4, singleNumber.singleNumber(new int[]{1, 4, 1, 2, 2}));
    }
}
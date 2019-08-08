package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/4 22:50
 */
public class NumberOf1BitsTest {

    private NumberOf1Bits bits = new NumberOf1Bits();

    @Test
    public void hammingWeight() {
        assertEquals(3, bits.hammingWeight(11));
    }
}
package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/8 17:40
 */
public class ReverseBitsTest {

    private ReverseBits bits = new ReverseBits();
    @Test
    public void reverseBits() {
        assertEquals(-1073741825, bits.reverseBits(-3));
    }
}
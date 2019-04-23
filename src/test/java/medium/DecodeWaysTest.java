package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/22 12:43
 */
public class DecodeWaysTest {

    private DecodeWays ways = new DecodeWays();

    @Test
    public void numDecodings() {
        assertEquals(2, ways.numDecodings("12"));
    }

    @Test
    public void numDecodings2() {
        assertEquals(3, ways.numDecodings("226"));
    }

}
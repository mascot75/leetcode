package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/6/21 16:26
 */
public class MultiplyStringsTest {

    private MultiplyStrings strings = new MultiplyStrings();

    @Test
    public void multiply() {
        assertEquals("6", strings.multiply("2", "3"));
        assertEquals("56088", strings.multiply("123", "456"));
        assertEquals("891", strings.multiply("9", "99"));
        assertEquals("121932631112635269", strings.multiply("123456789", "987654321"));
        assertEquals("419254329864656431168468", strings.multiply("498828660196", "840477629533"));

    }
}
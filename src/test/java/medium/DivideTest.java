package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/3/28 20:34
 */
public class DivideTest {

    private Divide divide = new Divide();

    @Test
    public void divide() {
        assertEquals(0, divide.divide(0, 2));
        assertEquals(3, divide.divide(100, 3));
        assertEquals(-2, divide.divide(7, -3));
        assertEquals(3, divide.divide(-13, -4));
        assertEquals(1, divide.divide(-1, -1));
        assertEquals(2147483647, divide.divide(-2147483648, -1));
        assertEquals(-1, divide.divide(-1, 1));
        assertEquals(-1, divide.divide(1, -1));
        assertEquals(2147483647, divide.divide(2147483647, 1));
        assertEquals(2, divide.divide(4, 2));
        assertEquals(-1073741824, divide.divide(-2147483648, 2));
    }
}
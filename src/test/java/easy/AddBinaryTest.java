package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/3 16:42
 */
public class AddBinaryTest {

    private AddBinary addBinary = new AddBinary();
    @Test
    public void addBinary() {
        assertEquals("100", addBinary.addBinary("11", "1"));
        assertEquals("1000", addBinary.addBinary("1", "111"));
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
        assertEquals("110110", addBinary.addBinary("100", "110010"));
    }
}
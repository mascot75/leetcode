package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/6/24 16:54
 */
public class Powx_nTest {

    private Powx_n powx_n = new Powx_n();
    @Test(timeout = 100)
    public void myPow() {

        assertEquals(65536.0, powx_n.myPow(2.0, 16), 0.00001);
        assertEquals(1024.0, powx_n.myPow(2.0, 10), 0.00001);
        assertEquals(9.26100, powx_n.myPow(2.1, 3), 0.00001);
        assertEquals(0.25000, powx_n.myPow(2.0, -2), 0.00001);
    }
}
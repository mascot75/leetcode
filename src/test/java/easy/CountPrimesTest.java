package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/8/2 19:20
 */
public class CountPrimesTest {

    private CountPrimes primes = new CountPrimes();

    @Test
    public void countPrimes() {
        assertEquals(4, primes.countPrimes(10));
    }
}
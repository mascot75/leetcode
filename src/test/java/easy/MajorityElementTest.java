package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/21 18:29
 */
public class MajorityElementTest {

    private MajorityElement element = new MajorityElement();

    @Test(timeout = 100)
    public void majorityElement() {
        assertEquals(3, element.majorityElement(new int[]{3, 2, 3}));
        assertEquals(2, element.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

    }
}
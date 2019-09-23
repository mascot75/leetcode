package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/9/22 19:27
 */
public class ContainsDuplicate_217Test {

    private ContainsDuplicate_217 containsDuplicate_217 = new ContainsDuplicate_217();

    @Test
    public void containsDuplicate() {
        assertTrue(containsDuplicate_217.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(containsDuplicate_217.containsDuplicate(new int[]{1, 2, 3, 4}));
    }
}
package easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/10 18:35
 */
public class FindDuplicateNumberTest {

    private FindDuplicateNumber findDuplicateNumber = new FindDuplicateNumber();

    @Test
    public void findDuplicate() {
        assertEquals(2, findDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        assertEquals(3, findDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        assertEquals(2, findDuplicateNumber.findDuplicate(new int[]{2, 2, 2, 2, 2}));
    }
}
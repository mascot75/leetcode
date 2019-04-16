package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/16 21:51
 */
public class SearchRangeTest {

    private SearchRange range = new SearchRange();

    @Test
    public void searchRange() {

        assertArrayEquals(new int[]{3, 4}, range.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, range.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
        assertArrayEquals(new int[]{0, 0}, range.searchRange(new int[]{1}, 1));
    }
}
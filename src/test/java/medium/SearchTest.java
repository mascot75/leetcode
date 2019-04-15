package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/15 21:46
 */
public class SearchTest {

    private Search search = new Search();

    @Test
    public void search() {
        assertEquals(4, search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        assertEquals(-1, search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}
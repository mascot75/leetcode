package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/3/6 21:05
 */
public class MergeTest {

    private Merge merge = new Merge();
    @Test
    public void merge() {
        int[] array = new int[]{1, 2, 3, 0, 0, 0};
        merge.merge(array, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(array, new int[]{1, 2, 2, 3, 5, 6});
    }

    @Test
    public void merge2() {
        int[] array = new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0};
        merge.merge(array, 6, new int[]{1, 2, 2}, 3);
        assertArrayEquals(array, new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3});

    }
}
package medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/4/5 13:58
 */
public class NextPermutationTest {

    private NextPermutation permutation = new NextPermutation();
    @Test
    public void nextPermutation() {
        int[] array = new int[]{1, 2, 3};
        permutation.nextPermutation(array);
        assertArrayEquals(new int[]{1, 3, 2}, array);

        array = new int[]{3, 2, 1};
        permutation.nextPermutation(array);
        assertArrayEquals(new int[]{1, 2, 3}, array);

        array = new int[]{1, 1, 5};
        permutation.nextPermutation(array);
        assertArrayEquals(new int[]{1, 5, 1}, array);

        array = new int[]{1, 3, 2};
        permutation.nextPermutation(array);
        assertArrayEquals(new int[]{2, 1, 3}, array);
    }
}
package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/5/21 21:49
 */
public class PermutationsTest {

    private Permutations permutations = new Permutations();

    @Test(timeout = 1000)
    public void permute() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 2, 3));
        lists.add(Arrays.asList(1, 3, 2));
        lists.add(Arrays.asList(2, 1, 3));
        lists.add(Arrays.asList(2, 3, 1));
        lists.add(Arrays.asList(3, 1, 2));
        lists.add(Arrays.asList(3, 2, 1));

        assertThat(lists, is(permutations.permute(new int[]{1, 2, 3})));
    }

    @Test(timeout = 1000)
    public void permute2() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(1));

        assertThat(lists, is(permutations.permute(new int[]{1})));
    }
}
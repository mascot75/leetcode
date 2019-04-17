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
 * @date 2019/4/17 8:43
 */
public class CombinationSumTest {

    private CombinationSum sum = new CombinationSum();

    @Test
    public void combinationSum1() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(2, 2, 3));
        lists.add(Collections.singletonList(7));
        assertThat(lists, is(sum.combinationSum(new int[]{2, 3, 6, 7}, 7)));
    }

    @Test
    public void combinationSum2() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(2, 2, 2, 2));
        lists.add(Arrays.asList(2, 3, 3));
        lists.add(Arrays.asList(3, 5));
        assertThat(lists, is(sum.combinationSum(new int[]{2, 3, 5}, 8)));
    }
}
package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/17 17:54
 */
public class Subsets2Test {

    private Subsets2 subsets2 = new Subsets2();

    @Test
    public void subsetsWithDup() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Collections.singletonList(1));
        result.add(Collections.singletonList(2));
        result.add(new ArrayList<>(Arrays.asList(1, 2)));
        result.add(new ArrayList<>(Arrays.asList(2, 2)));
        result.add(new ArrayList<>(Arrays.asList(1, 2, 2)));
        assertThat(result, is(subsets2.subsetsWithDup(new int[]{1, 2, 2})));
    }

    @Test
    public void subsetsWithDup2() {
                assertThat(subsets2.subsetsWithDup(new int[]{1, 2, 2}), containsInAnyOrder(
                new ArrayList<>(),
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(2)),
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(2, 2)),
                new ArrayList<>(Arrays.asList(1, 2, 2))));
    }
}
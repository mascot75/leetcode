package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/7/17 15:45
 */
public class SubsetsTest {

    private Subsets subsets = new Subsets();

    @Test(timeout = 10000)
    public void subsets() {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(Collections.singletonList(1));
        result.add(Collections.singletonList(2));
        result.add(Collections.singletonList(3));
        result.add(new ArrayList<>(Arrays.asList(1, 2)));
        result.add(new ArrayList<>(Arrays.asList(1, 3)));
        result.add(new ArrayList<>(Arrays.asList(2, 3)));
        result.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertThat(result, is(subsets.subsets(new int[]{1, 2, 3})));
    }
}
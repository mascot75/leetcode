package medium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author mascot
 * @date 2019/7/21 18:51
 */
public class MajorityElement2Test {

    private MajorityElement2 element2 = new MajorityElement2();

    @Test(timeout = 100)
    public void majorityElement() {
        assertThat(new ArrayList<>(Arrays.asList(3)),
                is(element2.majorityElement(new int[]{3, 2, 3})));

        assertThat(element2.majorityElement(new int[]{1, 2, 2, 3, 2, 1, 1, 3}),
                containsInAnyOrder(1, 2));

        assertThat(element2.majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2}),
                containsInAnyOrder(1, 2));
    }
}
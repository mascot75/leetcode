package easy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mascot
 * @date 2019/3/14 22:05
 */
public class SolutionTest {

    private Solution solution = new Solution();

//    @Test
//    public void generate() {
//        List<List<Integer>> generate = solution.generate(5);
//        System.out.println("Arrays.toString(g) = " + generate);
//    }

    @Test
    public void getRow() {
        System.out.println(solution.getRow(3));
    }
}
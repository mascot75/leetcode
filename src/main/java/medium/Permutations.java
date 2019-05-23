package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of distinct integers, return all possible permutations.
 *
 * @author mascot
 * @date 2019/5/21 21:41
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);
        result.add(temp);
        for (int i = 1; i < nums.length; i++) {
            int curSize = result.get(0).size();
            while (result.size() > 0) {
                List<Integer> list = result.get(0);
                if (list.size() > curSize) {
                    break;
                }

                for (int k = curSize; k >= 0; k--) {
                    list.add(k, nums[i]);
                    result.add(new ArrayList<>(list));
                    list.remove(k);
                }

                result.remove(0);
            }
        }

        return result;
    }
}

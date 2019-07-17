package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. 子集 II
 *
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * @author mascot
 * @date 2019/7/17 17:52
 */
public class Subsets2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        result.add(new ArrayList<>());
        int preSize = 0, currentSize = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSize = result.size();
            int j = (i > 0 && nums[i - 1] == nums[i]) ? preSize : 0;
            for (; j < currentSize; j++) {
                List<Integer> sublist = new ArrayList<>(result.get(j));
                sublist.add(nums[i]);
                result.add(sublist);
            }
            preSize = currentSize;
        }

        return result;
    }
}

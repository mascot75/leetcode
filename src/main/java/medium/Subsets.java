package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. 子集
 *
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * @author mascot
 * @date 2019/7/17 15:42
 */
public class Subsets {
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        doIt(nums, result, new ArrayList<>(), 0);
        return result;
    }

    private static void doIt(int[] nums, List<List<Integer>> result, List<Integer> list, int i) {
        if (i == nums.length) {
            result.add(list);
            return;
        }
        List<Integer> array = new ArrayList<>(list);
        array.add(nums[i]);
        doIt(nums, result, list, i + 1);
        doIt(nums, result, array, i + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        result.add(new ArrayList<>());
        for (int num : nums) {
            int currentSize = result.size();
            for (int j = 0; j < currentSize; j++) {
                List<Integer> sublist = new ArrayList<>(result.get(j));
                sublist.add(num);
                result.add(sublist);
            }
        }
        return result;
    }
}

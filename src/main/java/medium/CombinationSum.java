package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * @author mascot
 * @date 2019/4/17 8:42
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        find(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void find(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int number) {
        if (target == 0) {
            result.add(list);
            return;
        }

        if (target < candidates[0]) {
            return;
        }

        for (int i = number; i < candidates.length && target >= candidates[i]; i++) {
            List<Integer> temp = new ArrayList<>(list);
            temp.add(candidates[i]);
            find(result, temp, candidates, target - candidates[i], i);
        }
    }
}

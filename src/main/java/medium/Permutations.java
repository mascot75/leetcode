package medium;

import java.util.ArrayList;
import java.util.Arrays;
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


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int[] visited = new int[nums.length];
        backtrack(result, nums, visited, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int[] visited, ArrayList<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == 1 || (i > 0 && visited[i - 1] == 0 && nums[i - 1] == nums[i])) {
                continue;
            }

            visited[i] = 1;
            temp.add(nums[i]);
            backtrack(result, nums, visited, temp);
            temp.remove(temp.size() - 1);
            visited[i] = 0;
        }
    }
}

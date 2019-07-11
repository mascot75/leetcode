package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 560. 和为K的子数组
 *
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
 *
 * @author mascot
 * @date 2019/7/11 19:58
 */
public class SubarraySum {
    public int subarraySum3(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prefixSum = 0;
            for (int j = i; j < nums.length; j++) {
                prefixSum += nums[j];
                if (prefixSum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += record.getOrDefault(sum - k, 0);
            record.put(sum, record.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

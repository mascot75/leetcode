package medium;

import java.util.Arrays;

/**
 * 300. 最长上升子序列
 *
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * @author mascot
 * @date 2019/8/3 18:02
 */
public class LongestIncreasingSubsequence {
    public int lengthOfLIS3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int length = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, length, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == length) {
                length++;
            }
        }

        return length;
    }

    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        int length = 0;
        dp[0] = nums[0];
        for (int num : nums) {
            if (dp[length] < num) {
                dp[++length] = num;
            } else {
                int left = 0, right = length;
                while (left < right) {
                    int mid = (left + right) >> 1;
                    if (dp[mid] < num) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                dp[left] = num;
            }
        }

        return length + 1;
    }
}

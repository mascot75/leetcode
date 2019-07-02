package medium;

/**
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 *
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 *
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 *
 * 说明：
 *
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 *
 * @author mascot
 * @date 2019/7/1 19:22
 */
public class PermutationSequence {
    /**
     * 康拓展开
     * @param n 给定的范围
     * @param k 第 K 个数
     * @return 第 k 全排列
     */
    public String getPermutation(int n, int k) {

        int[] factorials = new int[n];
        factorials[0] = 1;
        for (int i = 1; i < factorials.length; i++) {
            factorials[i] = factorials[i - 1] * i;
        }

        StringBuilder sequence = new StringBuilder("123456789");
        StringBuilder result = new StringBuilder();

        for (--k; --n >= 0; k %= factorials[n]) {
            int i = k / factorials[n];
            result.append(sequence.charAt(i));
            sequence.deleteCharAt(i);
        }
        return result.toString();
    }

    /**
     * 回溯法
     * @param n 给定的范围
     * @param k 第 K 个数
     * @return 第 k 全排列
     */
    public String getPermutation2(int n, int k) {
        int[] help = new int[n];
        help[0] = 1;
        for (int i = 2; i <= n; i++) {
            help[i - 1] = i * help[i - 2];
        }
        String result = "";
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        return back(result, nums, k, help);
    }

    private String back(String result, int[] nums, int k, int[] help) {
        int left = nums.length - result.length();
        if (left == 1) {
            result += nums[findSmallest(nums, 1)];
            return result;
        }
        int j = k / help[left - 2];
        j = j + (k % help[left - 2] == 0 ? 0 : 1);
        int i = findSmallest(nums, j);
        result += nums[i];
        nums[i] = Integer.MAX_VALUE;
        return back(result, nums, k - (j - 1) * help[left - 2], help);
    }

    private int findSmallest(int[] nums, int j) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                count++;
            }
            if (j == count) {
                return i;
            }
        }
        return -1;
    }
}

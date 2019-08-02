package easy;

/**
 * 204. 计数质数
 *
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * @author mascot
 * @date 2019/8/2 19:03
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 3) {
            return 0;
        }
        //厄拉多塞筛法
        boolean[] nums = new boolean[n];
        nums[0] = nums[1] = true;
        for (int i = 2; i * i < n; i++) {
            if (!nums[i]) {
                for (int j = i * i; j < nums.length; j += i) {
                    nums[j] = true;
                }
            }
        }

        int count = 0;
        for (boolean num : nums) {
            count += num ? 0 : 1;
        }

        return count;
    }
}

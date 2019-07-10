package easy;

/**
 * 268. 缺失数字
 *
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * @author mascot
 * @date 2019/7/10 18:14
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (1 + nums.length) * nums.length / 2 - sum;
    }
}

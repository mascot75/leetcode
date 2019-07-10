package easy;

/**
 * 287. 寻找重复数
 *
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），
 * 可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 *
 * @author mascot
 * @date 2019/7/10 18:34
 */
public class FindDuplicateNumber {
    public int findDuplicate2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] > 0 ? nums[i] : -nums[i];
            if (nums[index - 1] < 0) {
                return index;
            }
            nums[index - 1] = -nums[index - 1];
        }
        return 0;
    }

    public int findDuplicate(int[] nums) {
        int index = 0, result = 0;
        while (true) {
            if (nums[index] == 0) {
                return result;
            }
            result = nums[index];
            nums[index] = 0;
            index = result;
        }
    }
}

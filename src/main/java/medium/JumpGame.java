package medium;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Determine if you are able to reach the last index.
 *
 * @author mascot
 * @date 2019/6/25 16:18
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int index = -1;
        for (int i = nums.length - 2; i >= 0; --i) {
            if (index == -1 && nums[i] == 0) {
                index = i;
            }

            index = index - i < nums[i] ? -1 : index;

        }
        return index == -1;
    }
}

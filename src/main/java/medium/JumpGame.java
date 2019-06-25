package medium;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Determine if you are able to reach the last index.
 *
 * @author mascot
 * @date 2019/6/25 16:18
 */
public class JumpGame {
//    /**
//     * 从后往前遍历如果数组没有 0 元素这表示满足要求。
//     * 出现 0 元素，记录其下标，然后依次判断是否有数字能跳过该元素。
//     * 如果出现多个 0 元素，应该优先解决数组末端的，因为出现一个元素能跳过最后一个出现的 0 元素，必能跳过他们之间的 0元素。
//     *
//     * index 用来记录 0 出现的位置，默认值是 -1，表示没有出现过 0
//     * i 从nums.length - 2 开始，因为最后一个元素是 0 也是满足的
//     * @param nums
//     * @return
//     */
//    public boolean canJump(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return false;
//        }
//
//        int index = -1;
//        for (int i = nums.length - 2; i >= 0; --i) {
//            if (index == -1 && nums[i] == 0) {
//                index = i;
//            }
//
//            index = index - i < nums[i] ? -1 : index;
//
//        }
//        return index == -1;
//    }


    /**
     * 另一种高效解法
     *
     */
    public boolean canJump(int[] nums) {
        int lastPosition = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPosition) {
                lastPosition = i;
            }
        }
        return lastPosition == 0;
    }
}

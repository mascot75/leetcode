package easy;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * @author mascot
 * @date 2019/4/20 15:31
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            System.arraycopy(nums, 0, nums, 1, nums.length - 1);
            nums[0] = temp;
        }
    }

}

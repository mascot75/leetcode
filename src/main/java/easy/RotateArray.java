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
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            swap(nums, begin++, end--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

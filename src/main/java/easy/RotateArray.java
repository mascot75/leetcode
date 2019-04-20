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

        int[] array = new int[k];
        System.arraycopy(nums, nums.length - k , array, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(array, 0, nums, 0, k);
    }
}

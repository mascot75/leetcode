package medium;

/**
 * @author mascot
 * @date 2019/4/5 13:57
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }

        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1);
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void reverse(int[] array, int start) {
        int i = start, j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }
}

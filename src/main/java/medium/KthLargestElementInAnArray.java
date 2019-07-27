package medium;

import java.util.Random;

/**
 * 215. 数组中的第K个最大元素
 *
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 *
 * @author mascot
 * @date 2019/7/27 19:18
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int left, int right, int kSmallest) {

        if (left == right) {
            return nums[left];
        }

        final Random random = new Random();
        int pivotIndex = left + random.nextInt(right - left);
        pivotIndex = partition(nums, left, right, pivotIndex);

        if (pivotIndex > kSmallest) {
            return quickSelect(nums, left, pivotIndex - 1, kSmallest);
        } else if (pivotIndex < kSmallest) {
            return quickSelect(nums, pivotIndex + 1, right, kSmallest);
        } else {
            return nums[pivotIndex];
        }
    }

    private int partition(int[] nums, int left, int right, int pivotIndex) {
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, right);
        int storeIndex = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] < pivot) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }
        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int swap = nums[i];
        nums[i] = nums[j];
        nums[j] = swap;
    }
}

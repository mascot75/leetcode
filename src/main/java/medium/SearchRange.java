package medium;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * @author mascot
 * @date 2019/4/16 21:50
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                int start = mid;
                while (start >= 0 && nums[start] == target) {
                    start--;
                }

                int end = mid;
                while (end <= nums.length - 1 && nums[end] == target) {
                    end++;
                }

                return new int[]{start + 1, end - 1};
            }
        }

        return new int[]{-1, -1};
    }
}

package easy;

/**
 *  167. 两数之和 II - 输入有序数组
 *
 *  给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 *  函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * @author mascot
 * @date 2019/7/11 19:09
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int high = numbers.length - 1, low = 0;
        while (high > low) {
            if (numbers[high] + numbers[low] == target) {
                return new int[]{low + 1, high + 1};
            }

            if (numbers[high] + numbers[low] > target) {
                high--;
            } else {
                low++;
            }
        }

        return new int[]{};
    }
}
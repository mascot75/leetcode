package medium;

/**
 * 75. 颜色分类
 *
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 *
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 *
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 *
 * @author mascot
 * @date 2019/7/14 13:25
 */
public class SortsColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int[] count = new int[3];
        for (int num : nums) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- != 0) {
                nums[index++] = i;
            }
        }
    }
}

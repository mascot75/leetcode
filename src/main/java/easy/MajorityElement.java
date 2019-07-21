package easy;

/**
 * 169. 求众数
 *
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * @author mascot
 * @date 2019/7/21 18:28
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        for (int num : nums) {
            element = count == 0 ? num : element;
            count += element == num ? 1 : -1;
        }
        return element;
    }
}

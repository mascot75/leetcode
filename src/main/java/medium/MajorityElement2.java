package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 229. 求众数 II
 *
 * 给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * <p>
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 *
 * @author mascot
 * @date 2019/7/21 18:51
 */
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int n = nums[0], m = nums[0], nCount = 0, mCount = 0;
        for (int num : nums) {
            if (num == n) {
                nCount++;
            } else if (num == m) {
                mCount++;
            } else if (nCount == 0) {
                n = num;
                nCount = 1;
            } else if (mCount == 0) {
                m = num;
                mCount = 1;
            } else {
                nCount--;
                mCount--;
            }
        }

        nCount = mCount = 0;
        for (int num : nums) {
            if (n == num) {
                nCount++;
            } else if (m == num) {
                mCount++;
            }
        }

        if (nCount > nums.length / 3) {
            result.add(n);
        }
        if (mCount > nums.length / 3) {
            result.add(m);
        }
        return result;
    }
}

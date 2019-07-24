package medium;

/**
 * 152. 乘积最大子序列
 *
 * 给定一个整数数组 nums ，找出一个序列中乘积最大的连续子序列（该序列至少包含一个数）。
 *
 * @author mascot
 * @date 2019/7/24 15:46
 */
public class MaximumProductSubarray {
    public int maxProduct2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = nums[0], maxProduct = 1, minProduct = 1;
        for (int num : nums) {
            if (num < 0) {
                int swap = maxProduct;
                maxProduct = minProduct;
                minProduct = swap;
            }

            maxProduct = Math.max(maxProduct * num, num);
            minProduct = Math.min(minProduct * num, num);
            max = Math.max(max, maxProduct);
        }

        return max;
    }

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], product = 1;
        for (int num : nums) {
            product *= num;
            max = Math.max(max, product);
            if (num == 0) {
                product = 1;
            }
        }

        product = 1;
        for (int i = nums.length - 1; i >= 0; --i) {
            product *= nums[i];
            max = Math.max(max, product);
            if (nums[i] == 0) {
                product = 1;
            }
        }

        return max;
    }
}

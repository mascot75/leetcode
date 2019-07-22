package easy;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * @author mascot
 * @date 2019/7/22 14:38
 */
public class MoveZeroes {
    public void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[zero] != 0) {
                zero++;
                if (zero == nums.length) {
                    return;
                }
            }

            if (i > zero && nums[i] != 0) {
                nums[zero] = nums[i];
                nums[i] = 0;
            }
        }
//
//        int zero = 0, nonzero = 0;
//        while (nonzero < nums.length) {
//            while (zero < nums.length && nums[zero] != 0) {
//                zero++;
//            }
//
//            while (nonzero < nums.length && nums[nonzero] == 0) {
//                nonzero++;
//            }
//
//            if (zero < nums.length && nonzero < nums.length) {
//                nums[zero] = nums[nonzero];
//                nums[nonzero] = 0;
//            }
//        }
    }

    public void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                nums[zero++] = nums[i];
            }
        }
        for ( ; zero < nums.length; zero++) {
            nums[zero] = 0;
        }
    }
}

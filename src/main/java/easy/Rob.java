package easy;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，
 * 影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * @author mascot
 * @date 2019/4/13 14:54
 */
public class Rob {

    public int rob(int[] nums) {

        if (nums.length < 2) {
            return nums.length == 1 ? nums[0] : 0;
        }


        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1], result[i - 2] + nums[i]);
        }

        return result[nums.length - 1];
    }

    public int rob3(int[] nums) {

        if (nums.length < 2) {
            return nums.length == 1 ? nums[0] : 0;
        }

        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
        }

        return nums[nums.length - 1];
    }

    public int rob2(int[] nums) {
        int one = 0;
        int two = 0;
        int result = 0;
        for (int num : nums) {
            result = Math.max(two, one + num);
            one = two;
            two = result;
        }

        return result;
    }
}

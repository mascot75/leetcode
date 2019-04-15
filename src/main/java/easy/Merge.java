package easy;

import java.util.Arrays;


/**
 * @author mascot
 * @date 2019/3/6 21:04
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        long l = System.currentTimeMillis();
        System.arraycopy(nums2, 0, nums1, m, n);
        long j = System.currentTimeMillis();
        Arrays.sort(nums1);
        long k = System.currentTimeMillis();
        System.out.println(j - l);
        System.out.println(k - j);
    }
}

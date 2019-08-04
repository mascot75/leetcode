package medium;

/**
 * 338. 比特位计数
 *
 *  给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，
 *  计算其二进制数中的 1 的数目并将它们作为数组返回。
 *
 * @author mascot
 * @date 2019/8/4 19:49
 */
public class CountingBits {
    public int[] countBits3(int num) {
        int[] count = new int[num + 1];
        int i = 0, b = 1;
        while (b <= num) {
            while (i < b && i + b <= num) {
                count[i + b] = count[i] + 1;
                ++i;
            }
            i = 0;
            b <<= 1;
        }
        return count;
    }

    public int[] countBits2(int num) {
        int[] count = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            // x / 2 is x >> 1 and x % 2 is x & 1
            count[i] = count[i >> 1] + (i & 1);
        }
        return count;
    }

    public int[] countBits(int num) {
        int[] count = new int[num + 1];
        for (int i = 1; i <= num; ++i) {
            count[i] = count[i & (i - 1)] + 1;
        }
        return count;
    }
}

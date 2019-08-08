package easy;

/**
 * 190. 颠倒二进制位
 *
 * 颠倒给定的 32 位无符号整数的二进制位。
 *
 * @author mascot
 * @date 2019/8/8 17:36
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = 1;
            bit <<= i;
            if ((n & bit) != 0) {
                bit = 1;
                bit <<= 31 - i;
                result += bit;
            }
        }

        return result;
    }
}

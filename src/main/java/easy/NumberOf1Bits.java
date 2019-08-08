package easy;

/**
 * 191. 位1的个数
 *
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 *
 * @author mascot
 * @date 2019/8/4 22:46
 */
public class NumberOf1Bits {
    public int hammingWeight2(int n) {
        int bit = 1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & bit) != 0) {
                count++;
            }
            bit <<= 1;
        }

        return count;
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}

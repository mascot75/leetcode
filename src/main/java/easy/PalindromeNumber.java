package easy;

/**
 * 9. 回文数
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author mascot
 * @date 2019/7/30 19:09
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        final byte[] bytes = (x + "").getBytes();
        int left = 0, right = bytes.length - 1;
        while (left < right) {
            if (bytes[left] != bytes[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

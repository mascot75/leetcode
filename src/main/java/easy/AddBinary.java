package easy;

/**
 * 67. 二进制求和
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * @author mascot
 * @date 2019/7/3 16:41
 */
public class AddBinary {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, sum = 0;
        while (i >= 0 || j >= 0) {
            sum += i >= 0 ? a.charAt(i--) - '0' : 0;
            sum += j >= 0 ? b.charAt(j--) - '0' : 0;
//            if (i >= 0) {
//                sum += a.charAt(i--) - '0';
//            }
//            if (j >= 0) {
//                sum += b.charAt(j--) - '0';
//            }
            result.append(sum & 1);
            sum /= 2;
        }
        result.append((sum & 1) == 0 ? "" : 1);
        return result.reverse().toString() ;
    }
}

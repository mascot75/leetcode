package medium;

/**
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2, also represented as a string.
 *
 * @author mascot
 * @date 2019/6/21 16:26
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        int[] result = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; --i) {
            for (int j = num2.length() - 1; j >= 0; --j) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                temp += result[i + j + 1];
                result[i + j] += temp / 10;
                result[i + j + 1] = temp % 10;
            }

        }

        int index = 0;
        while (index < result.length - 1 && result[index] == 0) {
            index++;
        }

        StringBuilder builder = new StringBuilder();
        for (; index < result.length; index++) {
            builder.append(result[index]);
        }

        return builder.toString();
    }
}

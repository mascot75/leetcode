package easy;

/**
 *
 557. 反转字符串中的单词 III

 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * @author mascot
 * @date 2019/9/25 19:48
 */
public class ReverseWords_557 {
    public String reverseWords(String s) {
        int front = 0;
        final byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == ' ') {
                reverseString(bytes, front, i - 1);
                front = i + 1;
            }
        }
        reverseString(bytes, front, bytes.length - 1);
        return new String(bytes);
    }

    private void reverseString(byte[] s, int left, int right) {
        while (left < right) {
            byte c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }
}

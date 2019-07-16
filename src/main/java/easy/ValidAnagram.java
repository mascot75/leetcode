package easy;

import java.util.Arrays;

/**
 * 242. 有效的字母异位词
 * <p>
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * @author mascot
 * @date 2019/7/16 15:55
 */
public class ValidAnagram {
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final byte[] sBytes = s.getBytes();
        Arrays.sort(sBytes);
        final byte[] tBytes = t.getBytes();
        Arrays.sort(tBytes);

        return Arrays.equals(sBytes, tBytes);
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

//        return Arrays.stream(count).filter(i -> i != 0).count() == 0;
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

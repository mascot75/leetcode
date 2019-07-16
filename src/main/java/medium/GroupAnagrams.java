package medium;

import java.util.*;

/**
 * 49. 字母异位词分组
 * <p>
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * @author mascot
 * @date 2019/7/16 15:19
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return Collections.emptyList();
        }

        Map<Integer, List<String>> result = new HashMap<>();
        for (String str : strs) {
            final byte[] bytes = str.getBytes();
            Arrays.sort(bytes);
            final int hashCode = Arrays.hashCode(bytes);
//            final String s = new String(bytes);
            if (!result.containsKey(hashCode)) {
                result.put(hashCode, new ArrayList<>());
            }
            result.get(hashCode).add(str);
        }
        return new ArrayList<>(result.values());
    }
}

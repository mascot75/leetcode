package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 89. 格雷编码
 *
 * 格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。
 *
 * 给定一个代表编码总位数的非负整数 n，打印其格雷编码序列。格雷编码序列必须以 0 开头。
 *
 *（镜像反射法）
 * @author mascot
 * @date 2019/9/20 18:53
 */
public class GrayCode_89 {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>() {{
            add(0);
        }};
        int head = 1;
        for (int i = 0; i < n; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add(head + result.get(j));
            }
            head <<= 1;
        }
        return result;
    }
}

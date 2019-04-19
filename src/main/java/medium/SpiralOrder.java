package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * @author mascot
 * @date 2019/4/19 17:10
 */
public class SpiralOrder {
    public List spiralOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return Collections.EMPTY_LIST;
        }
        int top = 0;
        int bottom = matrix.length - 1;
        int right = 0;
        int left = matrix[0].length - 1;

        List<Integer> list = new ArrayList<>();
        while (top <= bottom && right <= left) {
            int i = top;
            int j = right - 1;
            while (j < left) {
                j++;
                list.add(matrix[i][j]);
            }

            while (i < bottom) {
                i++;
                list.add(matrix[i][j]);
            }

            while (j > right && top != bottom) {
                j--;
                list.add(matrix[i][j]);
            }

            while (i > top + 1 && right != left) {
                i--;
                list.add(matrix[i][j]);
            }

            top++;
            bottom--;
            right++;
            left--;
        }

        return list;
    }
}

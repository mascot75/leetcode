package medium;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 * @author mascot
 * @date 2019/4/20 13:29
 */
public class SpiralMatrixTwo {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[][]{};
        }

        int top = 0;
        int bottom = n - 1;
        int right = 0;
        int left = n - 1;

        int[][] result = new int[n][n];
        int generate = 1;
        while (top <= bottom && right <= left) {
            int i = top;
            int j = right - 1;
            while (j < left) {
                j++;
                result[i][j] = generate++;
            }

            while (i < bottom) {
                i++;
                result[i][j] = generate++;
            }

            while (j > right && top != bottom) {
                j--;
                result[i][j] = generate++;
            }

            while (i > top + 1 && right != left) {
                i--;
                result[i][j] = generate++;
            }

            top++;
            bottom--;
            right++;
            left--;
        }

        return result;
    }
}


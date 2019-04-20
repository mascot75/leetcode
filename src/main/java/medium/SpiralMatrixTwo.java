package medium;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * @author mascot
 * @date 2019/4/20 13:29
 */
public class SpiralMatrixTwo {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];
        int generate = 1;
        int index = 0;
        while (generate <= n * n) {
            for (int i = index; i < n - index; i++) {
                result[index][i] = generate++;
            }

            for (int i = index + 1; i < n - index; i++) {
                result[i][n - index - 1] = generate++;
            }

            for (int i = n - index - 2; i >= index; i--) {
                result[n - index - 1][i] = generate++;
            }

            for (int i = n - index - 2; i > index; i--) {
                result[i][index] = generate++;
            }

            index++;
        }
        return result;
    }
}


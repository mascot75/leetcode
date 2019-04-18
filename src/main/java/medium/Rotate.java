package medium;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像
 * @author mascot
 * @date 2019/4/18 19:48
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        rotate(matrix, 0);
    }

    private void rotate(int[][] matrix, int index) {

        if (matrix.length >> 1 <= index) {
            return;
        }

        for (int i = index; i < matrix.length - 1 - index; i++) {
            int temp = matrix[index][i];
            matrix[index][i] = matrix[matrix.length - i - 1][index];
            matrix[matrix.length - i - 1][index] = matrix[matrix.length - index - 1][matrix.length - i - 1];
            matrix[matrix.length - index - 1][matrix.length - i - 1] = matrix[i][matrix.length - index - 1];
            matrix[i][matrix.length - index - 1] = temp;
        }

        rotate(matrix, index + 1);
    }
}

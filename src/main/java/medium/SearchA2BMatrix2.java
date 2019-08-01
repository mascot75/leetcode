package medium;

/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 * @author mascot
 * @date 2019/8/1 17:50
 */
public class SearchA2BMatrix2 {
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        for (int i = matrix[0].length - 1; i >= 0; i--) {
            if (matrix[0][i] <= target) {
                for (int[] ints : matrix) {
                    if (ints[i] == target) {
                        return true;
                    } else if (ints[i] > target) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = 0, column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] < target) {
                row++;
            } else if (matrix[row][column] > target) {
                column--;
            } else {
                return true;
            }
        }
        return false;
    }
}

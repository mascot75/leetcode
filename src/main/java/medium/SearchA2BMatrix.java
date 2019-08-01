package medium;

/**
 * 74. 搜索二维矩阵
 *
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 *
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 *
 * @author mascot
 * @date 2019/8/1 18:22
 */
public class SearchA2BMatrix {
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int row = matrix.length - 1, column = 0;
        while (row >= 0 && column < matrix[0].length) {
            if (matrix[row][column] < target) {
                column++;
            } else if (matrix[row][column] > target) {
                row--;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int left = 0, right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            int element = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (element < target) {
                left = mid + 1;
            } else if (element > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}

package medium;

/**
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 *
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 *
 * @author mascot
 * @date 2019/6/19 20:18
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] column = new int[9];
        int[] block = new int[9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int k = i / 3 * 3 + j / 3;
                    int temp = 1 << (board[i][j] - '0');
                    if ((temp & (row[i] | column[j] | block[k])) > 0) {
                        return false;
                    }
                    row[i] |= temp;
                    column[j] |= temp;
                    block[k] |= temp;
                }
            }
        }
        return true;
    }
}

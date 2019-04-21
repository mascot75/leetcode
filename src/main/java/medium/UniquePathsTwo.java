package medium;

/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 *
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 *
 * 现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
 *
 * 网格中的障碍物和空位置分别用 1 和 0 来表示。
 *
 * 说明：m 和 n 的值均不超过 100。
 *
 * @author mascot
 * @date 2019/4/21 14:45
 */
public class UniquePathsTwo {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] paths = new int[obstacleGrid.length][obstacleGrid[0].length];

        for (int i = 0; i < obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            paths[i][0] = 1;
        }

        for (int i = 0; i < obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            paths[0][i] = 1;
        }

        for (int i = 1; i < obstacleGrid.length; i++) {
            for (int j = 1; j < obstacleGrid[0].length; j++) {
//                if (obstacleGrid[i][j] == 1) {
//                    paths[i][j] = 0;
//                } else {
//                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
//                }
                paths[i][j] = obstacleGrid[i][j] == 1 ? 0 : paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

}

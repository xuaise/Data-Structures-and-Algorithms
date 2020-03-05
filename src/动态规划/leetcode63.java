package 动态规划;

/**
 *
 * 解题思路：动态规划  dp二维数组记录运动到原始数组每个位置路径数目，若原始数组某位置为1，dp数组中该位置为0，否组为
 * dp[i][j] = dp[i-1][j]+dp[i][j-1]
 */
public class leetcode63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;


        if (obstacleGrid[0][0] == 1) {
            return 0;
        }


        obstacleGrid[0][0] = 1;


        for (int i = 1; i < R; i++) {
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) ? 1 : 0;
        }


        for (int i = 1; i < C; i++) {
            obstacleGrid[0][i] = (obstacleGrid[0][i] == 0 && obstacleGrid[0][i - 1] == 1) ? 1: 0;
        }


        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (obstacleGrid[i][j] == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return obstacleGrid[R - 1][C - 1];
    }
}

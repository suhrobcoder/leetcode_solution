// https://leetcode.com/problems/unique-paths-ii

class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid.last().last() == 1) return 0
        val dp = Array(obstacleGrid.size + 1) { IntArray(obstacleGrid[0].size + 1) { 0 } }
        for (i in obstacleGrid.size - 1 downTo 0) {
            for (j in obstacleGrid[0].size - 1 downTo 0) {
                if (i == obstacleGrid.size - 1 && j == obstacleGrid[0].size - 1) {
                    dp[i][j] = 1
                    continue
                }
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1]
                }
            }
        }
        return dp[0][0]
    }
}
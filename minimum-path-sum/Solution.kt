// https://leetcode.com/problems/minimum-path-sum

class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val dp = Array(grid.size + 1) { IntArray(grid[0].size + 1) }
        for (i in grid.size - 1 downTo 0) {
            for (j in grid[0].size - 1 downTo 0) {
                if (i == grid.size - 1 || j == grid[0].size - 1) {
                    dp[i][j] = grid[i][j] + dp[i + 1][j] + dp[i][j + 1]
                    continue
                }
                dp[i][j] = grid[i][j] + minOf(dp[i + 1][j], dp[i][j + 1])
            }
        }
        dp.forEach{
            it.forEach{print("$it ")}
        println()
        }
        return dp[0][0]
    }
}
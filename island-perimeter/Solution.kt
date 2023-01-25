// https://leetcode.com/problems/island-perimeter

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val width = grid[0].size
        val height = grid.size
        var p = grid.sumBy { it.sum() } * 4
        for (i in 0 until height) {
            for (j in 0 until width) {
                if (j > 0 && grid[i][j] == 1 && grid[i][j - 1] == 1) {
                    p -= 2
                }
                if (i > 0 && grid[i][j] == 1 && grid[i - 1][j] == 1) {
                    p -= 2
                }
            }
        }
        return p
    }
}
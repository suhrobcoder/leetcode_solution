// https://leetcode.com/problems/reshape-the-matrix

class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        if (m * n != r * c) return mat
        return Array(r) { i ->
            IntArray(c) { j ->
                val x = i * c + j
                mat[x / n][x % n]
            }
        }
    }
}
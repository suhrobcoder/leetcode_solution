// https://leetcode.com/problems/valid-sudoku

class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val list = mutableListOf<Char>()
        for (i in 0..8) {
            list.clear()
            for (j in 0..8) {
                if (board[i][j] == '.') continue
                if (list.contains(board[i][j])) {
                    return false
                } else {
                    list.add(board[i][j])
                }
            }
            list.clear()
            for (j in 0..8) {
                if (board[j][i] == '.') continue
                if (list.contains(board[j][i])) {
                    return false
                } else {
                    list.add(board[j][i])
                }
            }
        }
        for (x in 0..2) {
            for (y in 0..2) {
                list.clear()
                for (i in 0..2) {
                    for (j in 0..2) {
                        if (board[x * 3 + i][y * 3 + j] == '.') continue
                        if (list.contains(board[x * 3 + i][y * 3 + j])) {
                            return false
                        } else {
                            list.add(board[x * 3 + i][y * 3 + j])
                        }
                    }
                }
            }
        }
        return true
    }
}
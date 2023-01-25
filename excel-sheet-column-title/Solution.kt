// https://leetcode.com/problems/excel-sheet-column-title

class Solution {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    fun convertToTitle(columnNumber: Int): String {
        if (columnNumber <= 26) {
            return letters[columnNumber - 1].toString()
        }
        return return convertToTitle((columnNumber - 1) / 26) + letters[(columnNumber - 1) % 26]
    }
}
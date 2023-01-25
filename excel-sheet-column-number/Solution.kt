// https://leetcode.com/problems/excel-sheet-column-number

class Solution {
    val letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    fun titleToNumber(columnTitle: String): Int {
        var result = 0
        for (c in columnTitle.toCharArray()) {
            val x = letters.indexOf(c) + 1
            result = result * 26 + x
        }
        return result
    }
}
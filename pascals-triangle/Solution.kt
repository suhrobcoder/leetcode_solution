// https://leetcode.com/problems/pascals-triangle

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        if (numRows == 1) return listOf(listOf(1))
        if (numRows == 2) return listOf(listOf(1), listOf(1, 1))
        val result = mutableListOf(listOf(1), listOf(1, 1))
        for (i in 3..numRows) {
            val newList = MutableList(i) { index ->
                when (index) {
                    0 -> 1
                    i - 1 -> 1
                    else -> result.last()[index] + result.last()[index - 1]
                }
            }
            result.add(newList)
        }
        return result
    }
}
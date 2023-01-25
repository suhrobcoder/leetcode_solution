// https://leetcode.com/problems/pascals-triangle-ii

class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex == 0) return listOf(1)
        if (rowIndex == 1) return listOf(1, 1)
        val result = mutableListOf(listOf(1), listOf(1, 1))
        for (i in 3..rowIndex+1) {
            val newList = MutableList(i) { index ->
                when (index) {
                    0 -> 1
                    i - 1 -> 1
                    else -> result.last()[index] + result.last()[index - 1]
                }
            }
            result.add(newList)
        }
        return result[rowIndex];
    }
}
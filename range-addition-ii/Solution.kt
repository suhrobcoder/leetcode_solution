// https://leetcode.com/problems/range-addition-ii

class Solution {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        var rMin = m
        var cMin = n
        for (op in ops) {
            rMin = minOf(rMin, op[0])
            cMin = minOf(cMin, op[1])
        }
        return rMin * cMin
    }
}
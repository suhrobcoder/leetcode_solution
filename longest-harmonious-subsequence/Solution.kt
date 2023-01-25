// https://leetcode.com/problems/longest-harmonious-subsequence

class Solution {
    fun findLHS(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        for (n in nums) {
            map[n] = (map[n] ?: 0) + 1
        }
        var max = 0
        for (key in map.keys) {
            if (map[key - 1] != null) {
                max = maxOf(max, map[key]!! + map[key - 1]!!)
            }
        }
        return max
    }
}
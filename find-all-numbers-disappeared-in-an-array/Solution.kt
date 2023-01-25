// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        for (i in 1..nums.size) {
            if (i !in nums) {
                result.add(i)
            }
        }
        return result
    }
}
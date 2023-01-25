// https://leetcode.com/problems/concatenation-of-array

class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        return IntArray(nums.size * 2) { nums[it % nums.size] }
    }
}
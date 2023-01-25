// https://leetcode.com/problems/longest-continuous-increasing-subsequence

class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var max = 0
        var cur = 1
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                cur++
            } else {
                max = maxOf(max, cur)
                cur = 1
            }
        }
        max = maxOf(max, cur)
        return max
    }
}
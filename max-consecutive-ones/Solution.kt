// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var current = 0
        for (num in nums) {
            if (num == 1) {
                current++
            } else {
                max = maxOf(max, current)
                current = 0
            }
        }
        max = maxOf(max, current)
        return max
    }
}
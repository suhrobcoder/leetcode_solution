// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var curSum = 0
        for (i in 0 until k) {
            curSum += nums[i]
        }
        var max = curSum
        for (i in k until nums.size) {
            curSum = curSum + nums[i] - nums[i - k]
            max = maxOf(max, curSum)
        }
        return 1.0 * max / k
    }
}
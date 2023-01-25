// https://leetcode.com/problems/largest-number-at-least-twice-of-others

class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var max1 = Int.MIN_VALUE
        var max2 = Int.MAX_VALUE
        var mI = -1
        for (i in nums.indices) {
            if (nums[i] > max1) {
                max2 = max1
                max1 = nums[i]
                mI = i
            } else if (nums[i] > max2) {
                max2 = nums[i]
            }
        }
        return if (max1 >= max2 * 2) mI else -1
    }
}
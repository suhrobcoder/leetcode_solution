// https://leetcode.com/problems/find-pivot-index

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = nums.sum()
        for (i in nums.indices) {
            rightSum -= nums[i]
            if (leftSum == rightSum) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}
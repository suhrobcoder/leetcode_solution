// https://leetcode.com/problems/array-partition

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var result = 0
        for (i in 0 until nums.size step 2) {
            result += nums[i]
        }
        return result
    }
}
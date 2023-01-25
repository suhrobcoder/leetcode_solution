// https://leetcode.com/problems/number-of-good-pairs

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var n = 0
        for (i in 0 until nums.size) {
            for (j in 0 until i) {
                if (nums[i] == nums[j]) {
                    n++
                }
            }
        }
        return n
    }
}
// https://leetcode.com/problems/contains-duplicate-ii

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] && j - i <= k) {
                    return true
                }
            }
        }
        return false
    }
}
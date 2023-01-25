// https://leetcode.com/problems/search-insert-position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in 0..nums.size-1) {
            if (nums[i] > target || nums[i] == target) {
                return i
            }
        }
        return nums.size
    }
}
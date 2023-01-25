// https://leetcode.com/problems/jump-game

class Solution {
    fun canJump(nums: IntArray): Boolean {
        var lastJumpPos = nums.size - 1
        for (i in nums.size - 2 downTo 0) {
            if (lastJumpPos - i <= nums[i]) {
                lastJumpPos = i
            }
        }
        return lastJumpPos == 0
    }
}
// https://leetcode.com/problems/move-zeroes

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var k = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (i in k until nums.size) {
            nums[i] = 0
        }
    }
}
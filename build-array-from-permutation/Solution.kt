// https://leetcode.com/problems/build-array-from-permutation

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        return IntArray(nums.size) {nums[nums[it]]}
    }
}
// https://leetcode.com/problems/maximum-product-of-three-numbers

class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        return maxOf(nums[0] * nums[1] * nums[nums.size - 1], nums[nums.size - 1] * nums[nums.size - 2] * nums[nums.size - 3])
    }
}
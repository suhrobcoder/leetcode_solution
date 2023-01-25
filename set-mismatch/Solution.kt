// https://leetcode.com/problems/set-mismatch

class Solution {
    fun findErrorNums(nums: IntArray): IntArray {
        val result = IntArray(2)
        val set = mutableSetOf<Int>()
        var sum = 0
        for (num in nums) {
            if (!set.add(num)) {
                result[0] = num
            }
            sum += num
        }
        result[1] = nums.size * (nums.size + 1) / 2 - (sum - result[0])
        return result
    }
}
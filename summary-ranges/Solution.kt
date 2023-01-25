// https://leetcode.com/problems/summary-ranges

class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return listOf()
        val result = mutableListOf<String>()
        var currentRange = nums[0] to nums[0]
        for (i in 1 until nums.size) {
            currentRange = if (nums[i] - nums[i-1] == 1) {
                currentRange.copy(second = nums[i])
            } else {
                result.add(
                    if (currentRange.first == currentRange.second) "${currentRange.first}"
                    else "${currentRange.first}->${currentRange.second}"
                )
                nums[i] to nums[i]
            }
        }
        result.add(
            if (currentRange.first == currentRange.second) "${currentRange.first}"
            else "${currentRange.first}->${currentRange.second}"
        )
        return result
    }
}
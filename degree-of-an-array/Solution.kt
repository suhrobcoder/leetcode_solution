// https://leetcode.com/problems/degree-of-an-array

class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val countMap = hashMapOf<Int, Int>()
        val posMap = hashMapOf<Int, Pair<Int, Int>>()
        for (i in nums.indices) {
            countMap[nums[i]] = countMap.getOrDefault(nums[i], 0) + 1
            if (posMap.contains(nums[i])) {
                posMap[nums[i]] = posMap[nums[i]]!!.first to i
            } else {
                posMap[nums[i]] = i to i
            }
        }
        var result = Int.MAX_VALUE
        var maxCount = 0
        for (key in countMap.keys) {
            if (countMap[key]!! > maxCount) {
                maxCount = countMap[key]!!
                result = posMap[key]!!.second - posMap[key]!!.first + 1
            } else if (countMap[key]!! == maxCount) {
                result = minOf(result, posMap[key]!!.second - posMap[key]!!.first + 1)
            }
        }
        return result
    }
}
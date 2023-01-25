// https://leetcode.com/problems/intersection-of-two-arrays

class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableSetOf<Int>()
        for (i in nums1) {
            for (j in nums2) {
                if (i == j) {
                    result.add(i)
                }
            }
        }
        return result.toIntArray()
    }
}
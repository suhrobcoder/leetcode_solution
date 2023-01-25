// https://leetcode.com/problems/intersection-of-two-arrays-ii

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in nums1) {
            if (i in nums2) {
                nums2[nums2.indexOf(i)] = -1
                result.add(i)
            }
        }
        return result.toIntArray()
    }
}
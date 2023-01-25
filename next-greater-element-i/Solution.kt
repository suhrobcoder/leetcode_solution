// https://leetcode.com/problems/next-greater-element-i

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        return IntArray(nums1.size) { i ->
            var elementFound = false
            var ans = -1
            for (num in nums2) {
                if (elementFound) {
                    if (num > nums1[i]) {
                        ans = num
                        break
                    }
                } else if (nums1[i] == num) {
                    elementFound = true
                }
            }
            ans
        }
    }
}
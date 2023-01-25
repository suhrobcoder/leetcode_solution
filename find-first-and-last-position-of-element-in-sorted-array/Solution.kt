// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)
        return intArrayOf(findFirstIndex(nums, target), findLastIndex(nums, target))
    }

    fun findFirstIndex(nums: IntArray, target: Int): Int {
        if (nums[0] == target) return 0
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] > target) {
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else if (nums[mid] == target) {
                if (nums[mid - 1] != target) {
                    return mid
                } else {
                    right = mid - 1
                }
            }
        }
        return -1
    }

    fun findLastIndex(nums: IntArray, target: Int): Int {
        if (nums[nums.size - 1] == target) return nums.size - 1
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (nums[mid] > target) {
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else if (nums[mid] == target) {
                if (nums[mid + 1] != target) {
                    return mid
                } else {
                    left = mid + 1
                }
            }
        }
        return -1
    }
}
// https://leetcode.com/problems/container-with-most-water

class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.size - 1
        while (left < right) {
            max = maxOf(max, (right - left) * minOf(height[left], height[right]))
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        return max
    }
}
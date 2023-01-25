// https://leetcode.com/problems/third-maximum-number

class Solution {
    fun thirdMax(nums: IntArray): Int {
        val sortedList = nums.toSet().sortedDescending()
        return if (sortedList.size > 2) {
            sortedList[2]
        } else {
            sortedList.first()
        }
    }
}
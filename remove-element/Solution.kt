// https://leetcode.com/problems/remove-element

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var result = nums.size
        val sorted = nums.sortedBy {
            if (it == `val`) 1 else 0
        }
        sorted.forEachIndexed { index, i ->
            nums[index] = i
            if (i == `val`) result--
        }
        return result
    }
}
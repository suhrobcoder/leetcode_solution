// https://leetcode.com/problems/majority-element

class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()
        nums.forEach {
            map[it] = (map[it] ?: 0) + 1
        }
        return map.filter { it.value > nums.size / 2 }.entries.first().key
    }
}
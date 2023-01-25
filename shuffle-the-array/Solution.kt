// https://leetcode.com/problems/shuffle-the-array

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        return IntArray(2 * n) {if (it % 2 == 0) nums[it/2] else nums[n+it/2]}
    }
}
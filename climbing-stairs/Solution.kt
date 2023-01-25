// https://leetcode.com/problems/climbing-stairs

class Solution {
    private val mem = mutableMapOf(1 to 1, 2 to 2)

    fun climbStairs(n: Int): Int {
        return mem[n] ?: (climbStairs(n - 1) + climbStairs(n - 2)).also {
            mem[n] = it
        }
    }
}
// https://leetcode.com/problems/arranging-coins

class Solution {
    fun arrangeCoins(n: Int): Int {
        return ((-1 + Math.sqrt(1 + 8.0 * n)) / 2).toInt()
    }
}
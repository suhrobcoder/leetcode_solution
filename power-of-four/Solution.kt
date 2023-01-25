// https://leetcode.com/problems/power-of-four

class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if (n <= 0) return false
        if (n == 1) return true
        return n % 4 == 0 && isPowerOfFour(n / 4)
    }
}
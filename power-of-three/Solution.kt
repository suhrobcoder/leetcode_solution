// https://leetcode.com/problems/power-of-three

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if (n <= 0) return false
        if (n == 1) return true
        return n % 3 == 0 && isPowerOfThree(n / 3)
    }
}
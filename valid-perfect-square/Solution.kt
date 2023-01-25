// https://leetcode.com/problems/valid-perfect-square

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var i = 1
        var n = num
        while (n > 0) {
            n -= i
            i += 2
        }
        return n == 0
    }
}
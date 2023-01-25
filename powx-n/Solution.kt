// https://leetcode.com/problems/powx-n

class Solution {
    fun myPow(x: Double, n: Int): Double {
        if (x == 0.0) return 0.0;
        if (x == 1.0) return 1.0;
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n < 0) {
            if (n == Int.MIN_VALUE) {
                return myPow(1 / x, Int.MAX_VALUE) / x
            }
            return myPow(1 / x, -1 * n)
        } else {
            val temp = myPow(x, n / 2)
            if (n % 2 == 0) {
                return temp * temp
            } else {
                return temp * temp * x
            }
        }
    }
}
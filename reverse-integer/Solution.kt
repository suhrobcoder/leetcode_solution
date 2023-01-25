// https://leetcode.com/problems/reverse-integer

class Solution {
    fun reverse(x: Int): Int {
        val list = ArrayList<Int>()
        var x1 = x
        var negative = false
        if (x1 < 0) {
            x1 *= -1
            negative = true
        }
        while (x1 > 0) {
            list.add(x1%10)
            x1 /= 10
        }
        var s = 0L
        for (i in 0..list.size-1) {
            s += 1L * list[i] * Math.pow(10.0, (list.size-i-1).toDouble()).toInt()
        }
        if (negative) {
            s *= -1
        }
        if (s < -2147483648 || s > 2147483647) {
            return 0
        }
        return s.toInt()
    }
}
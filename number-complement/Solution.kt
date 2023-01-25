// https://leetcode.com/problems/number-complement

class Solution {
    fun findComplement(num: Int): Int {
        if (num == Int.MAX_VALUE) {
            return 0
        }
        var x = 1
        if (num > 1073741824) {
            x = Int.MIN_VALUE
        } else {
            while (x <= num) {
                x *= 2
            }
        }
        if (x == num) {
            return 0
        } else {
            return x - num - 1
        }
    }
}
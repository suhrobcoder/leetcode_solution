// https://leetcode.com/problems/palindrome-number

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        if (x == 0) {
            return true
        }
        val list = ArrayList<Int>()
        var x1 = x
        while (x1 > 0) {
            list.add(x1 % 10)
            x1 /= 10
        }
        for (i in 0..list.size/2) {
            if (list[i] != list[list.size-i-1]) {
                return false
            }
        }
        return true
    }
}
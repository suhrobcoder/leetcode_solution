// https://leetcode.com/problems/number-of-segments-in-a-string

class Solution {
    fun countSegments(s: String): Int {
        var result = 0
        var con = false
        for (c in s.toCharArray()) {
            if (c == ' ') {
                if (con) {
                    con = false
                    result++
                }
            } else {
                if (!con) {
                    con = true
                }
            }
        }
        if (con) {
            result++
        }
        return result
    }
}
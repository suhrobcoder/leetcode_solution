// https://leetcode.com/problems/is-subsequence

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        if (s.isEmpty()) return true
        for (j in t.toCharArray()) {
            if (s[i] == j) {
                i++
            }
            if (i == s.length) {
                return true
            }
        }
        return i == s.length
    }
}
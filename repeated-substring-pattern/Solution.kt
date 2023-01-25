// https://leetcode.com/problems/repeated-substring-pattern

class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        for (i in 1..s.length / 2) {
            if (s.length % i != 0) continue
            val first = s.substring(0, i)
            var ok = true
            for (j in i until s.length step i) {
                if (s.substring(j, j + i) != first) {
                    ok = false
                }
            }
            if (ok) return true
        }
        return false
    }
}
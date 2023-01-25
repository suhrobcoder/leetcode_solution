// https://leetcode.com/problems/isomorphic-strings

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()
        for (i in 0 until s.length) {
            if (map[s[i]] == null && !map.containsValue(t[i])) {
                map[s[i]] = t[i]
            } else if (map[s[i]] != t[i]) {
                return false
            } 
        }
        return true
    }
}
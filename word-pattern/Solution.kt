// https://leetcode.com/problems/word-pattern

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<Char, String>()
        val words = s.split(" ")
        if (pattern.length != words.size) return false
        for (i in pattern.toCharArray().indices) {
            if (map[pattern[i]] == null && !map.containsValue(words[i])) {
                map[pattern[i]] = words[i]
            } else if (map[pattern[i]] != words[i]) {
                return false
            }
        }
        return true
    }
}
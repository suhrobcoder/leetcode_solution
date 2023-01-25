// https://leetcode.com/problems/valid-anagram

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Int>()
        for (c in s.toCharArray()) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for (c in t.toCharArray()) {
            if (map.getOrDefault(c, -1) > 0) {
                map[c] = map.getOrDefault(c, 0) - 1
            } else {
                return false
            }
        }
        for (key in map.keys) {
            if (map[key] != 0) {
                return false
            }
        }
        return true
    }
}
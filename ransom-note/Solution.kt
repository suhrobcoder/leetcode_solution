// https://leetcode.com/problems/ransom-note

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = hashMapOf<Char, Int>()
        for (c in magazine.toCharArray()) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        for (c in ransomNote.toCharArray()) {
            val x = map.getOrDefault(c, 0)
            if (x < 1) {
                return false
            }
            map[c] = x - 1
        }
        return true
    }
}
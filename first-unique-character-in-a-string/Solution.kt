// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    fun firstUniqChar(s: String): Int {
        val map = hashMapOf<Char, Pair<Int, Int>>()
        for (i in s.toCharArray().indices) {
            map[s[i]] = map.getOrDefault(s[i], 0 to i).first + 1 to i
        }
        var min = Int.MAX_VALUE
        for (key in map.keys) {
            if (map[key]?.first == 1) {
                min = minOf(min, map[key]!!.second)
            }
        }
        return if (min < Int.MAX_VALUE) min else -1
    }
}
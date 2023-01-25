// https://leetcode.com/problems/shortest-distance-to-a-character

class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val postions = mutableListOf<Int>()
        for (i in s.indices) {
            if (s[i] == c) postions.add(i)
        }
        var lastIndex = 0
        return IntArray(s.length) { i->
            var min = Int.MAX_VALUE
            for (postion in postions) {
                min = minOf(min, Math.abs(i - postion))
            }
            min
        }
    }
}
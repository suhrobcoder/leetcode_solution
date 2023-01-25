// https://leetcode.com/problems/longest-palindrome

class Solution {
    fun longestPalindrome(s: String): Int {
        val map = hashMapOf<Char, Int>()
        for (c in s.toCharArray()) {
            map[c] = map.getOrDefault(c, 0) + 1
        }
        var result = 0
        var hasOdd = false
        for (key in map.keys) {
            if (map[key]!! % 2 == 0) {
                result += map[key]!!
            } else {
                result += map[key]!! - 1
                hasOdd = true
            }
        }
        if (hasOdd) result++
        return result
    }
}
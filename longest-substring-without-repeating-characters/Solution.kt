// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var chars = ""
        for (c in s.toCharArray()) {
            if (c in chars) {
                val i = chars.indexOf(c)
                chars = chars.substring(i+1, chars.length)
            }
            chars += c
            result = maxOf(result, chars.length)
        }
        return result
    }
}
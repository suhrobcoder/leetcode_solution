// https://leetcode.com/problems/valid-palindrome

class Solution {
    fun isPalindrome(s: String): Boolean {
        val chars = s.toCharArray().filter { it.isLetterOrDigit() }
        val newString = chars.joinToString("").toLowerCase()
        return newString == newString.reversed()
    }
}
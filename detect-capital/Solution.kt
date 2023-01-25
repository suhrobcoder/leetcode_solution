// https://leetcode.com/problems/detect-capital

class Solution {
    fun detectCapitalUse(word: String): Boolean {
        return allCaps(word) || allLower(word) || onlyFirstCap(word)
    }

    fun allCaps(word: String): Boolean {
        for (c in word.toCharArray()) {
            if (c <= 'Z') {
                return false
            }
        }
        return true
    }

    fun allLower(word: String): Boolean {
        for (c in word.toCharArray()) {
            if (c >= 'a') {
                return false
            }
        }
        return true
    }

    fun onlyFirstCap(word: String): Boolean {
        if (word[0] >= 'a') return false
        for (i in 1 until word.length) {
            if (word[i] < 'a') {
                return false
            }
        }
        return true
    }
}
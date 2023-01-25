// https://leetcode.com/problems/length-of-last-word

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var result = 0
        var newWordBegin = false
        for (c in s.toCharArray()) {
            if (c == ' ') {
                newWordBegin = true
            } else {
                if (newWordBegin) {
                    newWordBegin = false
                    result = 1
                } else {
                    result++
                }
            }
        }
        return result
    }
}
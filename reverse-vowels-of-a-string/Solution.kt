// https://leetcode.com/problems/reverse-vowels-of-a-string

class Solution {
    val vowels = listOf('a', 'e', 'o', 'i', 'u', 'A', 'E', 'O', 'I', 'U')
    fun reverseVowels(s: String): String {
        var i = 0
        var j = s.length - 1
        val sb = StringBuilder(s)
        while (i < j) {
            while (!vowels.contains(s[i]) && i < j) {
                i++
            }
            while (!vowels.contains(s[j]) && i < j) {
                j--
            }
            if (i >= j) {
                break
            }
            sb.setCharAt(i, s[j])
            sb.setCharAt(j, s[i])
            i++
            j--
        }
        return sb.toString()
    }
}
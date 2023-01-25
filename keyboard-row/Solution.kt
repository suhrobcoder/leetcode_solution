// https://leetcode.com/problems/keyboard-row

class Solution {
    val rows = listOf("qwertyuiop", "asdfghjkl", "zxcvbnm")
    fun findWords(words: Array<String>): Array<String> {
        val list = mutableListOf<String>()
        for (word in words) {
            if (rows.any { row -> word.toLowerCase().all { it in row } })
                list.add(word)
        }
        return list.toTypedArray()
    }
}
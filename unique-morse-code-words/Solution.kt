// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    private val morse = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val set = mutableSetOf<String>()
        for (word in words) {
            val sb = StringBuilder()
            for (c in word.toCharArray()) {
                sb.append(morse[c - 'a'])
            }
            set.add(sb.toString())
        }
        return set.size
    }
}
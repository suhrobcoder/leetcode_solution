// https://leetcode.com/problems/find-the-difference

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val arr = t.toCharArray()
        for (i in s.toCharArray()) {
            arr[arr.indexOf(i)] = '*'
        }
        return arr.first { it != '*' }
    }
}
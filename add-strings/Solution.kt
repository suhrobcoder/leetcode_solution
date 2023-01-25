// https://leetcode.com/problems/add-strings

class Solution {
    fun addStrings(num1: String, num2: String): String {
        val sb = StringBuilder()
        val maxLen = maxOf(num1.length, num2.length)
        var hasMem = false
        for (i in 0 until maxLen) {
            val n1 = if (num1.length > i) num1[num1.length - i - 1] - '0' else 0
            val n2 = if (num2.length > i) num2[num2.length - i - 1] - '0' else 0
            val res = n1 + n2 + if (hasMem) 1 else 0
            hasMem = res > 9
            sb.insert(0, (res % 10).toString())
        }
        if (hasMem) {
            sb.insert(0, "1")
        }
        return sb.toString()
    }
}
// https://leetcode.com/problems/add-binary

class Solution {
    fun addBinary(a: String, b: String): String {
        var result = ""
        val length = maxOf(a.length, b.length)
        var inMemory = 0
        for (i in 0 until length) {
            val ai = if (a.length > i && a[a.length - i - 1] == '1') 1 else 0
            val bi = if (b.length > i && b[b.length - i - 1] == '1') 1 else 0
            var x = ai + bi + inMemory
            inMemory = 0
            if (x > 1) {
                inMemory = 1
                x -= 2
            }
            result += x.toString()
        }
        if (inMemory > 0) {
            result += "1"
        }
        return result.reversed()
    }
}
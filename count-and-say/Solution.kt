// https://leetcode.com/problems/count-and-say

class Solution {
    fun countAndSay(n: Int): String {
        var last = "1"
        for (i in 2..n) {
            var lastNum = last[0]
            var count = 0
            val result = StringBuilder()
            for (c in last.toCharArray()) {
                if (c == lastNum) {
                    count++
                } else {
                    result.append(count.toString())
                    result.append(lastNum)
                    lastNum = c
                    count = 1
                }
            }
            result.append(count.toString())
            result.append(lastNum)
            last = result.toString()
        }
        return last
    }
}
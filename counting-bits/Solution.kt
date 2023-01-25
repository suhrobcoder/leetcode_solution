// https://leetcode.com/problems/counting-bits

class Solution {
    fun countBits(n: Int): IntArray {
        val ans = IntArray(n + 1) { 0 }
        for (i in 1..n) {
            ans[i] = ans[i shr 1] + (i and 1)
        }
        return ans
    }
}
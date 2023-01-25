// https://leetcode.com/problems/fibonacci-number

class Solution {
    val mem = IntArray(31) { -1 }

    fun fib(n: Int): Int {
        mem[0] = 0
        mem[1] = 1
        if (mem[n] == -1) {
            return fib(n - 1) + fib(n - 2)
        } else {
            return mem[n]
        }
    }
}
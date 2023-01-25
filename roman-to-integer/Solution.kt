// https://leetcode.com/problems/roman-to-integer

class Solution {
    fun romanToInt(s: String): Int {
        val numbers = s.toCharArray().map {
            when (it) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }
        var result = numbers[0]
        for (i in 1 until numbers.size) {
            result += if (numbers[i] > numbers[i-1]) {
                numbers[i] - 2 * numbers[i-1]
            } else {
                numbers[i]
            }
        }
        return result
    }
}
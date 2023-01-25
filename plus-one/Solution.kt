// https://leetcode.com/problems/plus-one

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        digits[digits.size - 1] += 1
        for (i in digits.size - 1 downTo 1) {
            if (digits[i] > 9) {
                digits[i] = digits[i] % 10
                digits[i - 1] += 1
            }
        }
        if (digits[0] > 9) {
            digits[0] = digits[0] % 10 
            return IntArray(digits.size + 1) { index ->
                if (index == 0) 1
                else digits[index - 1]
            }
        }
        return digits
    }
}
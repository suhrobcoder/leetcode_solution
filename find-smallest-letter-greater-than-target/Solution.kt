// https://leetcode.com/problems/find-smallest-letter-greater-than-target

class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        for (l in letters) {
            if (l > target) {
                return l
            }
        }
        return letters.first()
    }
}
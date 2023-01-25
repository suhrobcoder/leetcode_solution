// https://leetcode.com/problems/teemo-attacking

class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        var result = 0
        var poisonEndTime = 0
        for (time in timeSeries) {
            if (time > poisonEndTime) {
                result += duration
            } else {
                result += duration - (poisonEndTime - time)
            }
            poisonEndTime = time + duration
        }
        return result
    }
}
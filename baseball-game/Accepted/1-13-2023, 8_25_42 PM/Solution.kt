// https://leetcode.com/problems/baseball-game

class Solution {
    fun calPoints(operations: Array<String>): Int {
        val scores = mutableListOf<Int>()
        for (o in operations) {
            if (o == "+") {
                scores.add(scores[scores.size - 1] + scores[scores.size - 2])
            } else if (o == "D") {
                scores.add(scores[scores.size - 1] * 2)
            } else if (o == "C") {
                scores.removeAt(scores.size - 1)
            } else {
                scores.add(o.toInt())
            }
        }
        return scores.sum()
    }
}
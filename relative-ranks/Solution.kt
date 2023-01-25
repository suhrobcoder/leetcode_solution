// https://leetcode.com/problems/relative-ranks

class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val sorted = score.sortedArray()
        return Array<String>(score.size) {
            val rank = sorted.size - sorted.indexOf(score[it])
            when (rank) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> rank.toString()
            }
        }
    }
}
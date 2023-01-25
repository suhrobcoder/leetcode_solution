// https://leetcode.com/problems/min-cost-climbing-stairs

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        for (i in cost.size - 3 downTo 0) {
            cost[i] = minOf(cost[i + 1], cost[i + 2]) + cost[i]
        }
        return minOf(cost[0], cost[1])
    }
}
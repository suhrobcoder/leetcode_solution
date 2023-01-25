// https://leetcode.com/problems/distribute-candies

class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        val set = mutableSetOf<Int>()
        for (type in candyType) {
            set.add(type)
        }
        return set.size.coerceAtMost(candyType.size / 2)
    }
}
// https://leetcode.com/problems/jewels-and-stones

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var s = 0
        for (c in stones.toCharArray()) {
            if (jewels.contains(c)) s++
        }
        return s
    }
}
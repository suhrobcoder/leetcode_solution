// https://leetcode.com/problems/minimum-index-sum-of-two-lists

class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        var minIndexSum = Int.MAX_VALUE
        val result = mutableListOf<String>()
        for (i in list1.indices) {
            for (j in list2.indices) {
                if (list1[i] == list2[j] && i + j <= minIndexSum) {
                    if (i + j < minIndexSum) {
                        minIndexSum = i + j
                        result.clear()
                    }
                    result.add(list1[i])
                }
            }
        }
        return result.toTypedArray()
    }
}
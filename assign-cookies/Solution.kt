// https://leetcode.com/problems/assign-cookies

class Solution {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var childCount = 0
        g.sort()
        s.sort()
        for (i in g.indices) {
            for (j in s.indices) {
                if (s[j] >= g[i]) {
                    childCount++
                    s[j] = 0
                    break
                }
            }
        }
        return childCount
    }
}
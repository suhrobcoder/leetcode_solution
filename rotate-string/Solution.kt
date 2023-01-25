// https://leetcode.com/problems/rotate-string

class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        return (goal + goal).contains(s) && s.length == goal.length
    }
}
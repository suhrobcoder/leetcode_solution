// https://leetcode.com/problems/construct-the-rectangle

class Solution {
    fun constructRectangle(area: Int): IntArray {
        var w = Math.sqrt(area.toDouble()).toInt()
        while (area % w != 0) {
            w--
        }
        return intArrayOf(area / w, w)
    }
}
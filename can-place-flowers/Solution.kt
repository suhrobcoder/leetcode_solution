// https://leetcode.com/problems/can-place-flowers

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var place = 0
        var currentEmpty = 0
        if (flowerbed[0] == 0) currentEmpty = 1
        for (i in flowerbed) {
            if (i == 0) {
                currentEmpty++
            } else {
                place += (currentEmpty - 1) / 2
                currentEmpty = 0
            }
        }
        if (currentEmpty > 0) {
            place += currentEmpty / 2
        }
        return place >= n
    }
}
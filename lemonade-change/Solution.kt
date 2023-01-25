// https://leetcode.com/problems/lemonade-change

class Solution {
    fun lemonadeChange(bills: IntArray): Boolean {
        var bill5 = 0
        var bill10 = 0
        for (bill in bills) {
            if (bill == 5) {
                bill5++
            } else if (bill == 10) {
                if (bill5 > 0) {
                    bill5--
                    bill10++
                } else {
                    return false
                }
            } else {
                if (bill5 > 0 && bill10 > 0) {
                    bill5--
                    bill10--
                } else if (bill5 > 2) {
                    bill5 -= 3
                } else {
                    return false
                }
            }
        }
            return true
    }
}
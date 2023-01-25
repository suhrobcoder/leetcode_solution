// https://leetcode.com/problems/convert-the-temperature

class Solution {
    fun convertTemperature(celsius: Double): DoubleArray {
        val array = DoubleArray(2)
        array[0] = celsius + 273.15
        array[1] = celsius*1.8+32.0
        return array
    }
}
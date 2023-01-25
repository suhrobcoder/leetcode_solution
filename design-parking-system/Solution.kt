// https://leetcode.com/problems/design-parking-system

class ParkingSystem(var big: Int, var medium: Int, var small: Int) {
    
    val count = arrayOf(big, medium, small)

    fun addCar(carType: Int): Boolean {
        return (count[carType - 1])-->0
    }

}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * var obj = ParkingSystem(big, medium, small)
 * var param_1 = obj.addCar(carType)
 */
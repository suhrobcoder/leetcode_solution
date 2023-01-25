// https://leetcode.com/problems/fizz-buzz

class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val oneIter = arrayOf(null, null, "Fizz", null, "Buzz", "Fizz", null, null, "Fizz", "Buzz", null, "Fizz", null, null, "FizzBuzz")
        return List(n) { i->
            val x = oneIter[i % 15]
            x ?: (i+1).toString()
        }
    }
}
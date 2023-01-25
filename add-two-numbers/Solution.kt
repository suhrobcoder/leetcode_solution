// https://leetcode.com/problems/add-two-numbers

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?, addOne: Boolean = false): ListNode? {
        if (l1 == null && l2 == null) {
            return if (addOne) ListNode(1)
            else null
        }
        val value = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + if (addOne) 1 else 0
        val result = ListNode(value % 10)
        result.next = addTwoNumbers(l1?.next, l2?.next, addOne = value > 9)
        return result
    }
}
// https://leetcode.com/problems/intersection-of-two-linked-lists

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
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var curA = headA
        while (curA != null) {
            var curB = headB
            while (curB != null) {
                if (curA == curB) {
                    return curA
                }
                curB = curB?.next
            }
            curA = curA?.next
        }
        return null
    }
}
// https://leetcode.com/problems/merge-two-sorted-lists

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
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) {
            return null
        }
        if (l1 == null) {
            return l2
        }
        if (l2 == null) {
            return l1
        }
        var last: ListNode? = ListNode(0)
        last?.next = ListNode(0)
        val head: ListNode? = last?.next
        var ll1 = l1
        var ll2 = l2
        while (ll1 != null && ll2 != null) {
            print(ll1.`val`.toString())
            print(ll2.`val`.toString())
            last = last?.next
            if (ll1.`val` < ll2.`val`) {
                last?.`val` = ll1.`val`
                ll1 = ll1.next
            } else {
                last?.`val` = ll2.`val`
                ll2 = ll2.next
            }
            last?.next = ListNode(0)
        }
        if (ll1 != null) {
            last?.next = ll1
        } else {
            last?.next = ll2
        }
        return head
    }
}
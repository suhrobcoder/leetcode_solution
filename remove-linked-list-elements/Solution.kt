// https://leetcode.com/problems/remove-linked-list-elements

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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var newHead = ListNode(0)
        var newCur = newHead
        var cur = head
        while (cur != null) {
            if (cur.`val` != `val`) {
                newCur?.next = ListNode(cur.`val`)
                newCur = newCur.next
            }
            cur = cur.next
        }
        return newHead?.next
    }
}
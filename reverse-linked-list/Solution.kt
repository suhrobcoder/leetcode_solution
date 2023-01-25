// https://leetcode.com/problems/reverse-linked-list

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
    fun reverseList(head: ListNode?): ListNode? {
        var newHead: ListNode? = null
        var cur = head
        while (cur != null) {
            val tail = newHead
            newHead = ListNode(cur.`val`)
            newHead.next = tail
            cur = cur.next
        }
        return newHead
    }
}
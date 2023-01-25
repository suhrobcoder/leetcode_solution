// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) return null
        val middle = (nums.size - 1) / 2
        val head = TreeNode(nums[middle])
        head.left = sortedArrayToBST(nums.copyOfRange(0, middle))
        head.right = sortedArrayToBST(nums.copyOfRange(middle + 1, nums.size))
        return head
    }
}
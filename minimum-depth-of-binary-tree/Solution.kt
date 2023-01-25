// https://leetcode.com/problems/minimum-depth-of-binary-tree

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
    fun minDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        if (root?.left == null && root?.right == null) {
            return 1
        }
        val leftDepth = if (root?.left == null) Int.MAX_VALUE else minDepth(root?.left)
        val rightDepth = if (root?.right == null) Int.MAX_VALUE else minDepth(root?.right)
        return minOf(leftDepth, rightDepth) + 1
    }
}
// https://leetcode.com/problems/symmetric-tree

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
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return areSymmetric(root?.left, root?.right)
    }

    fun areSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left == null || right == null) return false
        if (left?.`val` == right?.`val`) {
            return areSymmetric(left?.left, right?.right) && areSymmetric(left?.right, right?.left)
        }
        return false
    }
}
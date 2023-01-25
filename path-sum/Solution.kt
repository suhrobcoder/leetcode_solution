// https://leetcode.com/problems/path-sum

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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) {
            return false
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.`val`
        }
        if (root.left != null) {
            if (hasPathSum(root.left, targetSum - root.`val`)) return true
        }
        if (root.right != null) {
            if (hasPathSum(root.right, targetSum - root.`val`)) return true
        }
        return false
    }
}
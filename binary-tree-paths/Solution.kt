// https://leetcode.com/problems/binary-tree-paths

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
    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return listOf()
        val results = mutableListOf<String>()
        if (root.left != null) {
            results.addAll(binaryTreePaths(root.left))
        }
        if (root.right != null) {
            results.addAll(binaryTreePaths(root.right))
        }
        if (results.isEmpty()) {
            return listOf("${root.`val`}")
        }
        return results.map { x -> "${root. `val`}->$x" }
    }
}
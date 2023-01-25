// https://leetcode.com/problems/binary-tree-inorder-traversal

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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        val result = mutableListOf<Int>()
        if (root?.left != null) {
            result.addAll(inorderTraversal(root?.left))
        }
        result.add(root!!.`val`)
        if (root?.right != null) {
            result.addAll(inorderTraversal(root?.right))
        }
        return result
    }
}
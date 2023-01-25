// https://leetcode.com/problems/maximum-depth-of-n-ary-tree

/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun maxDepth(root: Node?): Int {
        if (root == null) return 0
        var max = 0
        root.children?.forEach {
            max = maxOf(max, maxDepth(it))
        }
        return max + 1
    }
}
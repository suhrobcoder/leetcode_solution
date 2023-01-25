// https://leetcode.com/problems/longest-common-prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var answer = ""
        while (true) {
            var yes = true
            var test = ""
            if (strs[0].length >= answer.length + 1) {
                test = strs[0].substring(0, answer.length + 1)
            } else {
                break
            }
            for (str in strs) {
                if (!str.startsWith(test)) {
                    yes = false
                }
            }
            if (!yes) {
                break
            }
            answer = test
        }
        return answer
    }
}
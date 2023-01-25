// https://leetcode.com/problems/missing-number

class Solution(object):
    def missingNumber(self, nums):
        n = len(nums)+1
        a = [1] * n
        for i in nums:
            a[i] = 0
        for i in range(n):
            if (a[i] == 1):
                return i
        return n-1
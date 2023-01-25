// https://leetcode.com/problems/single-number

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map<int, int> map;
        for (int i=0; i<nums.size(); i++) {
            map[nums[i]]++;
        }
        for (int i=0; i<nums.size(); i++) {
            if (map[nums[i]] == 1) {
                return nums[i];
            }
        }
        return 0;
    }
};
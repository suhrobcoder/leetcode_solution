// https://leetcode.com/problems/add-digits

class Solution {
public:
    int addDigits(long long num) {
        while (num > 9) {
            cout << num;
            int n = num;
            num = 0;
            while (n > 0) {
                num += n % 10;
                n /= 10;
            }
        }
        return num;
    }
};
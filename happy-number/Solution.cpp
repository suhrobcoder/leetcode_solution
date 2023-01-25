// https://leetcode.com/problems/happy-number

class Solution {
public:
    bool isHappy(int n) {
        map<int, bool> m;
        int n1 = n;
        while (true) {
            n1 = getSquareOfNumbers(n1);
            if (n1 == 1) {
                return true;
            }
            if (m[n1] == true) {
                return false;
            }
            m[n1] = true;
        }
        return false;
    }
    
    int getSquareOfNumbers(int n) {
        int s = 0;
        while (n > 0) {
            int x = n%10;
            s += x*x;
            n /= 10;
        }
        return s;
    }
};
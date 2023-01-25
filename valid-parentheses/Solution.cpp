// https://leetcode.com/problems/valid-parentheses

class Solution {
public:
    bool isValid(string s) {
        stack<char> stek;
        map<char, char> p;
        p['}'] = '{';
        p[')'] = '(';
        p[']'] = '[';
        for (int i=0; s[i]; i++) {
            char c = s[i];
            if (c == '{' || c == '(' || c == '[') {
                stek.push(c);
            } else {
                if (stek.empty()) {
                    return false;
                } else if (stek.top() != p[c]) {
                    return false;
                } else {
                    stek.pop();
                }
            }
        }
        if (stek.empty()) {
            return true;
        } else {
            return false;
        }
    }
};
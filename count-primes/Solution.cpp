// https://leetcode.com/problems/count-primes

class Solution {
public:
    int countPrimes(int n) {
        int s = 0;
        for (int i=2; i<n; i++) {
            if (isPrime(i)) {
                s++;
            }
        }
        return s;
    }
    
    bool isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // for (int i=6;i*i<=n;i+=6) {
        //     if (n % (i-1) == 0 || n % (i+1) == 0) {
        //         return false;
        //     }
        // }
        for (int i=2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
};
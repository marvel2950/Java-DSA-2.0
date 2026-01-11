class Solution {
    public int countPrimes(int n) {
        int count = 0;
        for(int i=1; i<n; i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int x) {
        if(x == 1) {
            return false;
        }
        for(int d=2; d<x; d++) {
            if(x%d == 0) {
                return false;
            }
        }
        return true;
    }

}
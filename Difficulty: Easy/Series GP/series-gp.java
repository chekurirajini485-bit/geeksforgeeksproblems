class Solution {
    
    static final int MOD = 1000000007;
    
    public int nthTerm(int a, int r, int n) {
        
        long power = fastPow(r, n - 1);
        long result = (a * power) % MOD;
        
        return (int) result;
    }
    
    // Fast exponentiation method
    private long fastPow(long base, long exp) {
        
        long result = 1;
        base = base % MOD;
        
        while (exp > 0) {
            
            if ((exp & 1) == 1) {   // if exponent is odd
                result = (result * base) % MOD;
            }
            
            base = (base * base) % MOD;
            exp = exp >> 1;  // exp = exp / 2
        }
        
        return result;
    }
}

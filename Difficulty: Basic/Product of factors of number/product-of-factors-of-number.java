class Solution {
    
    static final long MOD = 1000000007;
    
    int factorProduct(int N) {
        
        long num = N;
        long count = 0;
        
        // Count factors
        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i)
                    count += 1;
                else
                    count += 2;
            }
        }
        
        long power = count / 2;
        
        long result = modPow(num, power);
        
        // If perfect square (odd number of divisors)
        if ((count & 1) == 1) {
            long sqrt = (long) Math.sqrt(num);
            result = (result * sqrt) % MOD;
        }
        
        return (int) result;
    }
    
    // Fast exponentiation
    long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            
            base = (base * base) % MOD;
            exp >>= 1;
        }
        
        return result;
    }
}

class Solution {
    public int[] leastPrimeFactor(int n) {
        int[] lpf = new int[n + 1];

        // Least prime factor of 1 is 1
        lpf[1] = 1;

        // Sieve approach
        for (int i = 2; i <= n; i++) {
            // If not marked, then i is prime
            if (lpf[i] == 0) {
                lpf[i] = i;

                // Mark least prime factor for multiples of i
                for (long j = (long) i * i; j <= n; j += i) {
                    if (lpf[(int) j] == 0) {
                        lpf[(int) j] = i;
                    }
                }
            }
        }

        return lpf;
    }
}

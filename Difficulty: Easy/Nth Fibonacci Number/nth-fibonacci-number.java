class Solution {
    public int nthFibonacci(int n) {
        // Base cases
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        
        int a = 0, b = 1, c = 0;
        
        // Calculate Fibonacci numbers
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
}

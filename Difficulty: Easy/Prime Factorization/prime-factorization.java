class Solution {
    public static void printPrimeFactorization(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        // If n is still greater than 1, it is a prime number
        if (n > 1) {
            System.out.print(n);
        }
    }
}

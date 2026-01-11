class Solution {
    int isTwistedPrime(int N) {
        // Check if N is prime
        if (!isPrime(N)) {
            return 0;
        }

        // Reverse the number
        int rev = reverse(N);

        // Check if reverse is prime
        if (isPrime(rev)) {
            return 1;
        }

        return 0;
    }

    // Function to check prime
    boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; (long) i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to reverse a number
    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}

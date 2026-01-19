// User function Template for Java
class Solution {
    static long countDigits(long a, long b) {

        long product = a * b;

        // Handle zero case
        if (product == 0)
            return 1;

        // Take absolute value for negative numbers
        product = Math.abs(product);

        return (long)(Math.log10(product)) + 1;
    }
}

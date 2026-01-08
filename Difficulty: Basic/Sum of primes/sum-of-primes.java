class Solution {
    static int primeSum(int n) {
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            n /= 10;
        }
        
        return sum;
    }
}

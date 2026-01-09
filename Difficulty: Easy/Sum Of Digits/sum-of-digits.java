class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10; // get last digit
            n /= 10;       // remove last digit
        }

        return sum;
    }
}

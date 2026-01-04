class Solution {
    static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 1; // 1 is always a factor

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum == n;
    }
}

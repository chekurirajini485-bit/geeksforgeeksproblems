class Solution {
    public static int nextPrime(int n) {
        int num = n + 1;

        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    private static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Solution {

    static int numbersInRange(int L, int R) {

        if (L > R)
            return 0;

        return count(R) - count(L - 1);
    }

    static int count(int N) {

        if (N <= 0)
            return 0;

        if (N < 10)
            return N;   // all single digits valid

        String s = String.valueOf(N);
        int len = s.length();

        int first = s.charAt(0) - '0';
        int last = s.charAt(len - 1) - '0';

        int pow = (int) Math.pow(10, len - 2);

        // Extract middle part
        int middle = 0;
        if (len > 2) {
            middle = Integer.parseInt(s.substring(1, len - 1));
        }

        // Count smaller digit length numbers
        int smaller = 9 + (pow - 1);

        // Count current length numbers
        int current = (first - 1) * pow + middle;

        if (last >= first)
            current++;

        return smaller + current;
    }
}

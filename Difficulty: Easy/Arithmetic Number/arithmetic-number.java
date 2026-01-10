class Solution {
    static int inSequence(int a, int b, int c) {

        // Case when common difference is zero
        if (c == 0) {
            return (a == b) ? 1 : 0;
        }

        // Check if b fits the AP formula
        if ((b - a) % c == 0) {
            int k = (b - a) / c;
            if (k >= 0) {
                return 1;
            }
        }

        return 0;
    }
}

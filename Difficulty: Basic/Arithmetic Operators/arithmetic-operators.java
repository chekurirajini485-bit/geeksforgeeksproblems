class Solution {
    public int[] computeOperations(int x, int y) {
        int p = x + y;   // Addition
        int q = x - y;   // Subtraction
        int r = x * y;   // Multiplication
        int s = x / y;   // Division (integer division)
        int t = x % y;   // Modulo

        return new int[] { p, q, r, s, t };
    }
}

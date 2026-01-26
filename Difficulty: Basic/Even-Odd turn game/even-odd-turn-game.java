class Solution {
    static int findValue(int X, int Y, int P) {

        if (P % 2 == 0) {
            return Math.max(X, Y) / Math.min(X, Y);
        } 
        else {
            X = X * 2;
            return Math.max(X, Y) / Math.min(X, Y);
        }
    }
}

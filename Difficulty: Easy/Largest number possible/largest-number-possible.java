class Solution {
    static String findLargest(int n, int s) {
        
        // If sum is greater than max possible sum
        if (s > 9 * n) {
            return "-1";
        }
        
        // Special case
        if (s == 0) {
            return (n == 1) ? "0" : "-1";
        }
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            if (s >= 9) {
                result.append(9);
                s -= 9;
            } else {
                result.append(s);
                s = 0;
            }
        }
        
        return result.toString();
    }
}

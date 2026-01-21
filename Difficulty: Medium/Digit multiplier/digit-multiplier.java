import java.util.*;

class Solution {
    static String getSmallest(Long N) {
        
        // Special cases
        if (N == 0) return "10";
        if (N == 1) return "1";
        
        StringBuilder result = new StringBuilder();
        
        // Try dividing from 9 to 2
        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                result.append(i);
                N /= i;
            }
        }
        
        // If N is not fully factorized
        if (N != 1) {
            return "-1";
        }
        
        // Reverse to get smallest number
        return result.reverse().toString();
    }
}

class Solution {
    int firstOccurence(String txt, String pat) {
        
        int n = txt.length();
        int m = pat.length();
        
        // Loop through txt
        for (int i = 0; i <= n - m; i++) {
            
            int j;
            
            // Check for pattern match
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            
            // If full pattern matched
            if (j == m) {
                return i;
            }
        }
        
        // If not found
        return -1;
    }
}

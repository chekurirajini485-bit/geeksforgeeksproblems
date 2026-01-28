class Solution {
    
    public String nextPalin(String N) {
        int n = N.length();
        
        // If length <= 1, no higher palindrome possible
        if (n <= 1) return "-1";
        
        int halfLen = n / 2;
        
        // Take first half
        char[] left = N.substring(0, halfLen).toCharArray();
        
        // Find next permutation of left half
        if (!nextPermutation(left)) {
            return "-1";
        }
        
        StringBuilder result = new StringBuilder();
        
        // Append left half
        result.append(left);
        
        // Append middle if odd length
        if (n % 2 == 1) {
            result.append(N.charAt(halfLen));
        }
        
        // Append reverse of left half
        for (int i = left.length - 1; i >= 0; i--) {
            result.append(left[i]);
        }
        
        return result.toString();
    }
    
    // Standard next permutation logic
    private boolean nextPermutation(char[] arr) {
        int i = arr.length - 2;
        
        // Step 1: find first decreasing element
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i < 0) return false;
        
        // Step 2: find element just greater
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        // Step 3: swap
        swap(arr, i, j);
        
        // Step 4: reverse suffix
        reverse(arr, i + 1, arr.length - 1);
        
        return true;
    }
    
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(char[] arr, int l, int r) {
        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
    }
}

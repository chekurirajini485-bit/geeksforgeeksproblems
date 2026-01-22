class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        
        int[] arr = new int[n];
        
        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            arr[i] = a;     // store Fibonacci number
            int c = a + b;
            a = b;
            b = c;
        }
        
        return arr;
    }
}

class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}

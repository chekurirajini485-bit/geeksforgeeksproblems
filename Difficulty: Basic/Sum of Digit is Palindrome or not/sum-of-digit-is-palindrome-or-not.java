// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        int sumT=sum;
        int rev=0;
        while(sum>0)
        {
            int ld=sum%10;
            rev=(rev*10)+ld;
            sum=sum/10;
        }
        if(sumT==rev)
        return true;
        else
        return false;
        
    }
}
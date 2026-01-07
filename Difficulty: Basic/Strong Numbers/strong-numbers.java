// User function Template for Java

class Solution {
    public int is_StrongNumber(int n) {
        // Code here
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            int fact=1;
            for(int i=1;i<=ld;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
            
        }
        if(sum==temp)
            return 1;
            else
            return 0;
    }
    
}
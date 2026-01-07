// User function Template for Java

class Solution {
    static int isStrong(int N) {
        // code here
        int temp=N;
        int sum=0;
        while(N>0)
        {
            int ld=N%10;
            int fact=1;
            for(int i=1;i<=ld;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            N=N/10;
            
        }
        if(sum==temp)
            return 1;
            else
            return 0;
    }
};
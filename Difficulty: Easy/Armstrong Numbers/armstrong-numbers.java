// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n;
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        n=temp;
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            int expo=1;
            for(int i=1;i<=count;i++)
            {
                expo=expo*ld;
            }
            sum=sum+expo;
            n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
}
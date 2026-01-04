class Solution {
    static boolean isPrime(int n) {
        // code here
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==2)
        return true;
        else
        return false;
    }
}
class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(n>0)
        {
            int ld=n%10;
            rev=(rev*10)+ld;
            n=n/10;
            
        }
        int power=1;
        for(int i=1;i<=rev;i++)
        {
            power=power*temp;
        }
        return power;
    }
}

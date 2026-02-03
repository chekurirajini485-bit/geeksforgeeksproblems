// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        int end=0;
        if(a<b)
        end=b;
        else
        end=a;
        int hcf=0;
        for(int i=1;i<=end;i++){
        
        if(a%i==0 && b%i==0)
         hcf=i;
        }
        return hcf;
    }
}
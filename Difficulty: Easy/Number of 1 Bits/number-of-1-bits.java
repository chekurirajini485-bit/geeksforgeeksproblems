// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int count=0;
        int place=1;
        int by=0;
        while(n>0)
        {
            int ld=n%2;
            if(ld==1)
            count++;
             by=by+(ld*place);
            place=place*10;
            n=n/2;
        }
        return count;
    }
}
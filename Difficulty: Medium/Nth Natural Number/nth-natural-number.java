class Solution {
    long findNth(long n) {
        
        long result = 0;
        long place = 1;
        
        while (n > 0) {
            
            long rem = n % 9;
            result = result + rem * place;
            
            place = place * 10;
            n = n / 9;
        }
        
        return result;
    }
}

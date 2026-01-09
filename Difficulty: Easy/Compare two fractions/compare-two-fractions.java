class Solution {

    String compareFrac(String str) {
        // Split the two fractions
        String[] parts = str.split(", ");
        
        // Split numerator and denominator
        String[] f1 = parts[0].split("/");
        String[] f2 = parts[1].split("/");
        
        long a = Long.parseLong(f1[0]);
        long b = Long.parseLong(f1[1]);
        long c = Long.parseLong(f2[0]);
        long d = Long.parseLong(f2[1]);
        
        long val1 = a * d;
        long val2 = c * b;
        
        if (val1 > val2) {
            return parts[0];
        } else if (val1 < val2) {
            return parts[1];
        } else {
            return "equal";
        }
    }
}

import java.util.ArrayList;

class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        
        ArrayList<Float> result = new ArrayList<>();
        
        // Exact division result
        float exact = a / b;
        
        // Rounded to 3 decimal places
        float formatted = Float.parseFloat(String.format("%.3f", exact));
        
        // Add both values to ArrayList
        result.add(exact);
        result.add(formatted);
        
        return result;
    }
}

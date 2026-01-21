import java.util.*;

class Solution {
    public void sortIt(int[] arr) {
        
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        
        // Separate odd and even numbers
        for(int num : arr) {
            if(num % 2 == 1)
                odd.add(num);
            else
                even.add(num);
        }
        
        // Sort odd in descending order
        Collections.sort(odd, Collections.reverseOrder());
        
        // Sort even in ascending order
        Collections.sort(even);
        
        int index = 0;
        
        // Add odd numbers first
        for(int num : odd) {
            arr[index++] = num;
        }
        
        // Add even numbers next
        for(int num : even) {
            arr[index++] = num;
        }
    }
}

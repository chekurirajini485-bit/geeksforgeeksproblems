import java.util.*;

class Solution {
    static List<Integer> get(int a, int b) {
        // Swap using addition and subtraction
        a = a + b;
        b = a - b;
        a = a - b;

        // Store result in a list
        List<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);

        return ans;
    }
}

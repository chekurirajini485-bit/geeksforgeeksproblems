import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); // 0! and 1! = 1

        for (int i = 2; i <= n; i++) {
            multiply(i, result);
        }

        Collections.reverse(result);
        return result;
    }

    private static void multiply(int num, ArrayList<Integer> result) {
        int carry = 0;

        for (int i = 0; i < result.size(); i++) {
            int prod = result.get(i) * num + carry;
            result.set(i, prod % 10);
            carry = prod / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }
    }
}

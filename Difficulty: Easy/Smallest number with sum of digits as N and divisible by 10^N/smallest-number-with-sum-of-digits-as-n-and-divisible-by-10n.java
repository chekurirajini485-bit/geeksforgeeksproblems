// User function Template for Java

class Solution {
    public String digitsNum(int N) {

        StringBuilder sb = new StringBuilder();

        int temp = N;

        // Build smallest number whose digit sum = N
        while (temp > 9) {
            sb.append(9);
            temp -= 9;
        }

        if (temp > 0) {
            sb.append(temp);
        }

        // Reverse to make smallest number (small digit first)
        sb.reverse();

        // Append N zeros for divisibility by 10^N
        for (int i = 0; i < N; i++) {
            sb.append('0');
        }

        return sb.toString();
    }
}

class Solution {
    static int evenlyDivides(int n) {
        int count = 0;
        int temp = n;   // store original number

        while (temp > 0) {
            int ld = temp % 10;   // last digit

            if (ld != 0 && n % ld == 0) {
                count++;
            }

            temp = temp / 10;
        }

        return count;
    }
}

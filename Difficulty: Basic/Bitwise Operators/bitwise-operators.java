import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int d = a ^ a;          // XOR of a with itself
        int e = c ^ b;          // XOR of c and b
        int f = a & b;          // AND of a and b
        int g = c | (a ^ a);    // OR of c and (a ^ a)
        e = ~e;                 // Bitwise NOT of e

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}

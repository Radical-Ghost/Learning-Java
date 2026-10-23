// Repeated Substring Pattern

// Function Signature: boolean repeatedSubstringPattern(String s)
// Sample Input: "abab"
// Sample Output: true (The string can be constructed from "ab".)

import java.util.Scanner;

public class Problem_15 {
    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(repeatedSubstringPattern(s));

        sc.close();
    }
}

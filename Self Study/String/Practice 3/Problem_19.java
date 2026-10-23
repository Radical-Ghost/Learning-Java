// Longest Palindromic Substring

// Function Signature: String longestPalindrome(String s)
// Sample Input: "babad"
// Sample Output: "bab" (The longest palindromic substring.)

import java.util.Scanner;

public class Problem_19 {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) return s == null ? "" : s;

        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        String input = sc.nextLine().trim();

        if (input.startsWith("\"") && input.endsWith("\"") && input.length() >= 2) {
            input = input.substring(1, input.length() - 1);
        }

        String result = longestPalindrome(input);
        System.out.println(result);

        sc.close();
    }
}

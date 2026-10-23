// Longest Substring Without Repeating Characters

// Function Signature: int lengthOfLongestSubstring(String s)
// Sample Input: "abcabcbb"
// Sample Output: 3 (The longest substring is "abc".)

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Problem_11 {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int n = s.length();
        int left = 0;

        Set<Character> window = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            while (window.contains(ch)) {
                window.remove(s.charAt(left));
                left++;
            }

            window.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLongestSubstring(s));

        sc.close();
    }
}

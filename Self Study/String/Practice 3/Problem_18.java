// Count Distinct Substrings

// Function Signature: int countDistinctSubstrings(String s)
// Sample Input: "abc"
// Sample Output: 6 (Distinct substrings: "a", "b", "c", "ab", "bc", "abc".)

import java.util.Scanner;

public class Problem_18 {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
    }

    public static int countDistinctSubstrings(String s) {
        if (s == null || s.isEmpty()) return 0;

        TrieNode root = new TrieNode();
        int distinctCount = 0;

        for (int i = 0; i < s.length(); i++) {
            TrieNode curr = root;
            for (int j = i; j < s.length(); j++) {
                int index = s.charAt(j) - 'a';

                if (curr.children[index] == null) {
                    curr.children[index] = new TrieNode();
                    distinctCount++;
                }
                curr = curr.children[index];
            }
        }

        return distinctCount;
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

        System.out.println(countDistinctSubstrings(input));

        sc.close();
    }
}

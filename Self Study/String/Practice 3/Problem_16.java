// Word Break Problem

// Function Signature: boolean wordBreak(String s, List<String> wordDict)
// Sample Input: ("leetcode", ["leet", "code"])
// Sample Output: true (The string can be segmented.)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_16 {

    public static boolean wordBreak(String s, List<String> wordDict) {
        if (s == null || s.isEmpty()) return false;

        Set<String> dict = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        int maxWordLen = 0;
        for (String word : wordDict) {
            maxWordLen = Math.max(maxWordLen, word.length());
        }

        for (int i = 1; i <= n; i++) {
            // Check substrings s[j...i]
            for (int j = i - 1; j >= Math.max(0, i - maxWordLen); j--) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        String combined = sc.nextLine();

        int start = combined.indexOf("\"");
        int end = combined.indexOf("\"", start + 1);
        String s = combined.substring(start + 1, end);

        start = combined.indexOf("[");
        end = combined.lastIndexOf("]");
        String listPart = combined.substring(start + 1, end);

        List<String> wordDict = new ArrayList<>();
        Matcher m = Pattern.compile("\"([^\"]+)\"").matcher(listPart);
        while (m.find()) {
            wordDict.add(m.group(1));
        }

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);

        sc.close();
    }
}

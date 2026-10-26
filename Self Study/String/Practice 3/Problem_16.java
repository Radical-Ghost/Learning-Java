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
        Set<String> dict = new HashSet<>(wordDict);

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Matcher m = Pattern.compile("\"([^\"]+)\"").matcher(input);
        List<String> words = new ArrayList<>();

        while (m.find()) {
            words.add(m.group(1));
        }

        String s = words.remove(0);

        System.out.println(wordBreak(s, words));
        sc.close();
    }
}

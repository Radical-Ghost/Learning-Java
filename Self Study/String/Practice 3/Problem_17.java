// Finding All Permutations

// Function Signature: List<String> permute(String s)
// Sample Input: "abc"
// Sample Output: ["abc", "acb", "bac", "bca", "cab", "cba"] (All unique permutations.)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem_17 {

    public static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) return result;

        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sorts characters to handle duplicates and maintain order
        boolean[] used = new boolean[chars.length];

        backtrack(chars, used, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            // Skip already selected characters
            if (used[i]) continue;

            // Skip identical adjacent characters to avoid duplicate permutations
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars[i]);

            backtrack(chars, used, current, result);

            // Backtrack state
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
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

        List<String> permutations = permute(input);

        String formatted = permutations.stream()
                .map(p -> "\"" + p + "\"")
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(formatted);

        sc.close();
    }
}

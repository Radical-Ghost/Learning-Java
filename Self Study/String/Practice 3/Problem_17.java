// Finding All Permutations

// Function Signature: List<String> permute(String s)
// Sample Input: "abc"
// Sample Output: ["abc", "acb", "bac", "bca", "cab", "cba"] (All unique permutations.)

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problem_17 {

    public static void permute(String str, String ans, List<String> result) {
        if (str.length() == 0) {
            result.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String rem = str.substring(0, i) + str.substring(i+1);

            permute(rem, ans+ch, result);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }

        String input = sc.nextLine().strip();
        if (input.startsWith("\"") && input.endsWith("\"") && input.length() >= 2) {
            input = input.substring(1, input.length() - 1);
        }

        permute(input, "", result);

        String formatted = result.stream()
                .map(p -> "\"" + p + "\"")
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(formatted);

        sc.close();
    }
}

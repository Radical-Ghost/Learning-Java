// Find Hex Color Codes

// Function Signature: List<String> findHexColorCodes(String text)
// Description: Implement a Java function that finds and returns all hexadecimal color codes in a given string. A valid hex color code starts with # followed by six hexadecimal digits.
// Sample Input: "Here are some colors: #FF5733, #C70039, and #900C3F."
// Sample Output: ["#FF5733", "#C70039", "#900C3F"]

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public class Problem_25 {
    public static List<String> findHexColorCodes(String text) {
        List<String> colors = new ArrayList<>();
        Matcher matcher = Pattern.compile("#[0-9A-Fa-f]{6}\\b").matcher(text);

        while(matcher.find()) colors.add(matcher.group());

        return colors;
    }

    public static StringBuilder formatWithQuotes(String text) {
        List<String> list = findHexColorCodes(text);

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append("\"").append(list.get(i)).append("\"");
            if (i < list.size() - 1) sb.append(", ");
        }
        sb.append("]");

        return sb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(formatWithQuotes(text));

        sc.close();
    }
}

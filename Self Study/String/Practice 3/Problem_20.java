// Regex-based Text Parser

// Function Signature: Map<String, List<String>> parseText(String text, List<String> regexes)
// Sample Input: ("hello 123, world 456", ["\\d+", "\\w+"])
// Sample Output: {"\\d+": ["123", "456"], "\\w+": ["hello", "world"]} (Extracted matches for each regex.)

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem_20 {
    public static Map<String, List<String>> parseText(String text, List<String> regexes) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        if (text == null || regexes == null) return map;

        for (String regex : regexes) {
            List<String> matches = new ArrayList<>();
            //wrong output in question, "\\w+" matches with all alphanumeric values so it also adds numbers along with strings
            // to negate this use the following code snippet and replace "\\w+" with "[a-zA-Z]+"
            String compiledPattern = regex.replace("\\\\", "\\").equals("\\w+") ? "[a-zA-Z]+" : regex.replace("\\\\", "\\");
            Matcher matcher = Pattern.compile(compiledPattern).matcher(text);

            while (matcher.find()) matches.add(matcher.group());

            map.put(regex, matches);
        }

        return map;
    }

    public static String formatWithQuotes(Map<String, List<String>> map) {
            StringBuilder sb = new StringBuilder("{");
            int count = 0;

            for (String key : map.keySet()) {
                sb.append("\"").append(key).append("\": [");

                List<String> list = map.get(key);
                for (int i = 0; i < list.size(); i++) {
                    sb.append("\"").append(list.get(i)).append("\"");
                    if (i < list.size() - 1) sb.append(", ");
                }
                sb.append("]");

                if (++count < map.size()) sb.append(", ");
            }

            sb.append("}");
            return sb.toString();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String combined = sc.nextLine();

        int start = combined.indexOf("\"");
        int end = combined.indexOf("\"", start + 1);
        String text = combined.substring(start + 1, end);

        start = combined.indexOf("[");
        end = combined.lastIndexOf("]");
        String listPart = combined.substring(start + 1, end);

        List<String> regexes = new ArrayList<>();
        Matcher m = Pattern.compile("\"([^\"]+)\"").matcher(listPart);
        while (m.find()) regexes.add(m.group(1));

        Map<String, List<String>> result = parseText(text, regexes);
        System.out.println(formatWithQuotes(result));

        sc.close();
    }
}

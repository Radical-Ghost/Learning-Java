// Extract Dates

// Function Signature: List<String> extractDates(String text)
// Description: Implement a Java method that extracts all dates from a given text. Assume dates are in the format MM/DD/YYYY.
// Sample Input: "Important dates: 01/15/2022, 02/28/2022, and 03/10/2022."
// Sample Output: ["01/15/2022", "02/28/2022", "03/10/2022"]

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem_22 {
    public static List<String> extractDates(String text) {
        List<String> dates = new ArrayList<>();
        if (text == null) return dates;

        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);

        while(matcher.find()) dates.add(matcher.group());

        return dates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(extractDates(text));
    }
}

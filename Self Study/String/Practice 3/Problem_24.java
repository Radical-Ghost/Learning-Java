// URL Validator

// Function Signature: boolean isValidURL(String url)
// Description: Write a Java method that checks if a given string is a valid URL. Use a regular expression to ensure it follows the standard URL format (e.g., http:// or https://).
// Sample Input: "https://www.example.com"
// Sample Output: true


import java.util.Scanner;

public class Problem_24 {
    public static boolean isValidURL(String url) {
        return url.matches("^https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url = sc.nextLine();

        if (isValidURL(url)) System.out.println("true");
        else System.out.println("false");

        sc.close();
    }
}

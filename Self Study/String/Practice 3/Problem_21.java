// Email Validator

// Function Signature: boolean isValidEmail(String email)
// Description: Write a Java function that uses a regular expression to determine if a given string is a valid email address. Consider common email formats while validating.
// Sample Input: "example@example.com"
// Sample Output: true

import java.util.Scanner;

public class Problem_21 {
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("[a-zA-Z0-9.+_-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isValidEmail(new String (sc.nextLine())));
    }
}

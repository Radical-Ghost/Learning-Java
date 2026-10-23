// Phone Number Normalizer

// Function Signature: String normalizePhoneNumber(String phone)
// Description: Create a Java function that normalizes a phone number by removing all non-digit characters and formatting it as (XXX) XXX-XXXX. If the input is invalid, return "Invalid Number".
// Sample Input: "(123) 456-7890"
// Sample Output: "(123) 456-7890"

import java.util.Scanner;

public class Problem_23 {
    public static String normalizePhoneNumber(String phone) {
        if (phone.matches("^\\([0-9]{3}\\) [0-9]{3}\\-[0-9]{4}")) return phone;
        else return new String("Invalid Number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phone = sc.nextLine();

        System.out.println(normalizePhoneNumber(phone));

        sc.close();
    }
}

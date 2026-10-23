// 5. WAP in Java to check if a given string is a palindrome and count the number of palindromes in an array of strings.

// The program should ignore spaces and case sensitivity while checking for palindromes.

// Sample Input:
// 5
// level
// Madam
// civic
// World
// rotor

// Sample Output:
// 4

import java.util.Scanner;

public class Problem_10 {
    public static String reverseString(String word) {
        char[] letters = word.toCharArray();
        int left = 0;
        int right = letters.length - 1;

        while(left < right) {
            char discriminant = letters[left];
            letters[left] = letters[right];
            letters[right] = discriminant;

            left++;
            right--;
        }

        return new String(letters);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.nextLine();

        for (int i = 0; i < n; i++) {
            String cleaned = words[i].replaceAll("\\s+", "").toLowerCase();
            String rev = reverseString(cleaned);
            if (cleaned.equals(rev)) count++;
        }

        System.out.println(count);
    }
}

// 3. WAP in Java to check if the given strings have alternating vowels and consonants.

// The first character should be a vowel.
// The second character should be a consonant.
// The pattern continues alternately for the length of the string.
// Return the list of strings that match this pattern.

// Sample Input: 5
// apetuk
// detrwp
// aweyip
// grtypq
// ezovuj

// Sample Output:
// apetuk
// aweyip
// ezovuj

import java.util.Scanner;

public class Problem_08 {
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static boolean isAlternating(String word) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);

                boolean shouldBeVowel = (i % 2 == 0);

                if (shouldBeVowel != isVowel(ch)) return false;
            }
            return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) words[i] = sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (isAlternating(word)) System.out.println(word);
        }
        sc.close();
    }
}

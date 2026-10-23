// 4. WAP in Java to find all strings in an array that contain exactly two vowels and three consonants, and return the matching strings.

// Sample Input:
// 5
// train
// horse
// apple
// brisk
// flute

// Sample Output:
// train
// horse
// apple
// flute

import java.util.Scanner;

public class Problem_09{
    public static int countVowels(String word) {
            String vowelsOnly = word.replaceAll("[^aeiouAEIOU]", "");
            return vowelsOnly.length();
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.nextLine();

        for (int i = 0; i < n; i++) {
            if (words[i].length() != 5) continue;

            int vowelCount = countVowels(words[i]);
            int consonantCount = words[i].length() - vowelCount;

            if (vowelCount == 2 && consonantCount == 3) System.out.println(words[i]);
        }
        sc.close();
    }
}

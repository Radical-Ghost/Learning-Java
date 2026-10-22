// 2. WAP in java to count the number of occurrences in the array of strings and return the number of occurrences.

// countOccurrence(String[] arr): returns the number of occurrences of the word found in the array of strings.

// Sample Input:
// 4
// The fox is going into the jungle.
// The lion is the king.
// Fox has jumped over the wall.
// Fox has two friends Gary the fox and Matt the turtle
// Enter the word to be searched: fox

// Sample Output:
// 4

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] sentences = new String[n];

        for (int i = 0; i < n; i++) sentences[i] = sc.nextLine();

        System.out.print("Enter the word to be searched: ");
        String word = sc.next();

        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] words = sentences[i].split(" ");

            for (int j = 0; j < words.length; j++) if (words[j].equalsIgnoreCase(word)) count++;
        }

        System.out.println(count);
    }
}

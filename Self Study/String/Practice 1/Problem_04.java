// Question 4: Count Words Ending with Specific Letter

// Sample Input 1 (Valid):

// The quick brown fox jumps
// s

// Output:
// 1

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String x = String.valueOf(sc.nextLine().charAt(0));

        int count = 0;

        for (int i = 0; i < words.length; i++) if (words[i].charAt(words[i].length() - 1) == x.charAt(0)) count++;

        System.out.println(count);
    }
}

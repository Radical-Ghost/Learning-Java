// Question 2: Capitalize First Letter of Each Word

// Sample Input 1 (Valid):

// hello world from java

// Output:
// Hello World From Java

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) words[i] = Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }

        System.out.println(String.join(" ", words));
    }
}

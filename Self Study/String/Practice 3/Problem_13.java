// String Compression

// Function Signature: String compressString(String s)
// Sample Input: "aabcccccaaa"
// Sample Output: "a2b1c5a3" (The compressed version.)

import java.util.Scanner;

public class Problem_13 {
    public static String compressString(String s) {
        char[] letters = s.toCharArray();
        String result = "";
        int number = 0;
        char letter = letters[0];


        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) number++;
            else {
                result += letter + String.valueOf(number);
                letter = letters[i];
                number = 1;
            }
        }

        result += letter + String.valueOf(number);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(compressString(s));

        sc.close();
    }
}

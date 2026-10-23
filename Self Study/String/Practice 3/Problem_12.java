// Valid Parentheses

// Function Signature: boolean isValid(String s)
// Sample Input: "()[]{}"
// Sample Output: true (All parentheses are valid.)

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_12 {
    public static boolean isValid(String s) {
        if (s.matches(".*[^(){}\\[\\]].*")) return false;

        char[] parentheses = s.toCharArray();
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i] == '(' || parentheses[i] == '[' || parentheses[i] == '{') stack.add(parentheses[i]);
            else if ((parentheses[i] == ')' && stack.getLast() == '(') ||
                (parentheses[i] == ']' && stack.getLast() == '[') ||
                (parentheses[i] == '}' && stack.getLast() == '{')) stack.removeLast();
            else return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isValid(s));
    }
}

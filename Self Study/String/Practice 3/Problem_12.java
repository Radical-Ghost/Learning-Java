// Valid Parentheses

// Function Signature: boolean isValid(String s)
// Sample Input: "()[]{}"
// Sample Output: true (All parentheses are valid.)

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Problem_12 {
    public static boolean isValid(String s) {
        if (s.matches(".*[^(){}\\[\\]].*")) return false;

        char[] parentheses = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < parentheses.length; i++) {
            if (parentheses[i] == '(' || parentheses[i] == '[' || parentheses[i] == '{') stack.push(parentheses[i]);
            else if ((parentheses[i] == ')' && stack.peek() == '(') ||
                (parentheses[i] == ']' && stack.peek() == '[') ||
                (parentheses[i] == '}' && stack.peek() == '{')) stack.pop();
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

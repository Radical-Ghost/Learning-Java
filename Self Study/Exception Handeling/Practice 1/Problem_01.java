// Question 1: Null Pointer Exception Handling Write a method getStringLength that takes a string and returns its length. Handle the NullPointerException if the input string is null and return an appropriate message.

// Sample Input 1 (Valid):

// getStringLength("Hello")
// Output: 5

// Sample Input 2 (Invalid - null string):

// getStringLength(null)
// Output: "Error: Null value passed"

import java.util.Scanner;

public class Problem_01 {
    public static Object getStringLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            return "Error: Null value passed";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getStringLength(sc.nextLine()));
        System.out.println(getStringLength(sc.nextLine()));
    }
}

// 1. Samuel is given a String which contains some numbers and alphabets.
// He must implement a method numberSegregator(String s) to remove the numbers from the string and store in a List.
// It the String doesn't have any number then, the method should throw an "Invalid Input" exception.

// Sample Input 1:
// dgarg534htyty6758gh56

// Sample Output 1:
// [534, 6758, 56]

// Sample Input 2:
// dgarghtytygh

// Sample Output 1:
// Invalid Input

import java.util.ArrayList;
import java.util.List;

public class Problem_06 {
    public static void numberSegregator(String text) {
        try {
            List<Integer> numbers = new ArrayList<>();
            int discriminant = 0;
            for (char s : text.toCharArray()) {
                if (Character.isDigit(s)) discriminant = discriminant * 10 + (s - '0');
                else {
                    if (discriminant != 0) {
                        numbers.add(discriminant);
                        discriminant = 0;
                    }
                }
            }
            if (discriminant != 0) numbers.add(discriminant);
            if (numbers.isEmpty()) System.out.println("Invalid Input");
            else System.out.println(numbers);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }


    public static void main(String[] args) {
        String text = "dgarg534htyty6758gh56";
        String text1 = "dgarghtytygh";
        numberSegregator(text);
        numberSegregator(text1);
    }
}

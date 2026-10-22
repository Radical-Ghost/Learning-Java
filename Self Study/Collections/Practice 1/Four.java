// Question 4: Reverse the Elements in a List Write a method reverseList that takes a List<String> and returns a new list with the elements in reverse order.

// Sample Input 1:

// reverseList(["Java", "Python", "C++", "Ruby"])
// Output: ["Ruby", "C++", "Python", "Java"]

// Sample Input 2:

// reverseList(["apple", "banana", "cherry"])
// Output: ["cherry", "banana", "apple"]

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Four {
    public static List<String> reverseList (List<String> arr) {
        List<String> rev = new ArrayList<>(arr);
        Collections.reverse(rev);
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseList(List.of("Java", "Python", "C++", "Ruby")));
        System.out.println(reverseList(List.of("apple", "banana", "cherry")));
    }
}

// Question 3: Count Frequency of Each Element in a List Write a method countFrequency that takes a List<String> and returns a Map<String, Integer> where each key is a string from the list and the value is the count of occurrences of that string.

// Sample Input 1:

// countFrequency(["apple", "banana", "apple", "orange", "banana", "apple"])
// Output: {apple=3, banana=2, orange=1}

// Sample Input 2:

// countFrequency(["cat", "dog", "cat", "dog", "cat"])
// Output: {cat=3, dog=2}


import java.util.LinkedHashMap;
import java.util.List;

public class Problem_03 {
    public static LinkedHashMap<String, Integer> countFrequency (List<String> words) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String s : words) map.put(s, map.getOrDefault(s, 0) + 1);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(countFrequency(List.of("cat", "dog", "cat", "dog", "cat")));
        System.out.println(countFrequency(List.of("apple", "banana", "apple", "orange", "banana", "apple")));
    }
}
